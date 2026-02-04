package com.yvseann.learning.item;

import com.yvseann.learning.Sean;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Money = registerItem("money", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Sean.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Sean.LOGGER.info("Registering Mod Items for " + Sean.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
           entries.add(Money);
        });
    }
}

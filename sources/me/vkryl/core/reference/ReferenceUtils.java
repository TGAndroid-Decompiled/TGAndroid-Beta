package me.vkryl.core.reference;

import java.lang.ref.Reference;
import java.util.ArrayList;

public abstract class ReferenceUtils {
    public static void removeReference(ArrayList arrayList, Object obj) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((Reference) arrayList.get(size)).get();
            if (obj2 == null || obj2 == obj) {
                arrayList.remove(size);
                return;
            }
        }
    }
}

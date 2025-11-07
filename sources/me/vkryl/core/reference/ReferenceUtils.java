package me.vkryl.core.reference;

import java.lang.ref.Reference;
import java.util.List;

public abstract class ReferenceUtils {
    public static boolean removeReference(List list, Object obj) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj2 = ((Reference) list.get(size)).get();
            if (obj2 == null || obj2 == obj) {
                list.remove(size);
                return true;
            }
        }
        return false;
    }

    public static boolean addReference(ReferenceCreator referenceCreator, List list, Object obj) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            Reference reference = (Reference) list.get(size);
            Object obj2 = reference != null ? reference.get() : null;
            if (obj2 == null) {
                list.remove(size);
            } else if (obj2 == obj) {
                z = true;
            }
        }
        if (z) {
            return false;
        }
        Reference newReference = referenceCreator.newReference(obj);
        if (newReference == null) {
            throw new IllegalArgumentException();
        }
        list.add(newReference);
        return true;
    }
}

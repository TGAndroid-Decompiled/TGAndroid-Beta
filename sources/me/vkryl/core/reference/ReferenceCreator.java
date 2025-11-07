package me.vkryl.core.reference;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public interface ReferenceCreator {
    Reference newReference(Object obj);

    public abstract class CC {
        public static Reference $default$newReference(ReferenceCreator referenceCreator, Object obj) {
            return new WeakReference(obj);
        }
    }
}

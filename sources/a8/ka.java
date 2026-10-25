package a8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class ka {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.c4 c4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(c4Var) != obj && atomicReferenceFieldUpdater.get(c4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}

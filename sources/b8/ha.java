package b8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class ha {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.d4 d4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(d4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(d4Var) != obj && atomicReferenceFieldUpdater.get(d4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}

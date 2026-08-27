package g7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class q5 {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.e4 e4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(e4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(e4Var) != obj && atomicReferenceFieldUpdater.get(e4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}

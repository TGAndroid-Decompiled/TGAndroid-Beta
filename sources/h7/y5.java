package h7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class y5 {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.g4 g4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(g4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(g4Var) != obj && atomicReferenceFieldUpdater.get(g4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}

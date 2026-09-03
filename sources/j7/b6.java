package j7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b6 {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.f4 f4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(f4Var) != obj && atomicReferenceFieldUpdater.get(f4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}

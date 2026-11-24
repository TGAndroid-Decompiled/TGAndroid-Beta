package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class g6f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, wdf wdfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(wdfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(wdfVar) != obj && atomicReferenceFieldUpdater.get(wdfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

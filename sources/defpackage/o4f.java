package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class o4f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, a7f a7fVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(a7fVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(a7fVar) != obj && atomicReferenceFieldUpdater.get(a7fVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

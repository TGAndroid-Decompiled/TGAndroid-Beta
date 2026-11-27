package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class f7f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, p9f p9fVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(p9fVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(p9fVar) != obj && atomicReferenceFieldUpdater.get(p9fVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

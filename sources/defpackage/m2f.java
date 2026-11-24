package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class m2f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, y4f y4fVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(y4fVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(y4fVar) != obj && atomicReferenceFieldUpdater.get(y4fVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

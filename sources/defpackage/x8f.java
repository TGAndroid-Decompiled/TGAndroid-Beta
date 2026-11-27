package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class x8f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lgf lgfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lgfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(lgfVar) != obj && atomicReferenceFieldUpdater.get(lgfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class z2f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, cmd cmdVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cmdVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(cmdVar) != obj && atomicReferenceFieldUpdater.get(cmdVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

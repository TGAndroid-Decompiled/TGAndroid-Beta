package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class e4f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vbf vbfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vbfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(vbfVar) != obj && atomicReferenceFieldUpdater.get(vbfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

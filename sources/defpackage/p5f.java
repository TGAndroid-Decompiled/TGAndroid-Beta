package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class p5f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, rod rodVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(rodVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(rodVar) != obj && atomicReferenceFieldUpdater.get(rodVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class x0f {
    public static boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, akd akdVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(akdVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(akdVar) != obj && atomicReferenceFieldUpdater.get(akdVar) != obj) {
                return false;
            }
        }
        return true;
    }
}

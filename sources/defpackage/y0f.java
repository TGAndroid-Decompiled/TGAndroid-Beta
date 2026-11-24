package defpackage;

import sun.misc.Unsafe;
public abstract class y0f {
    public static boolean a(Unsafe unsafe, akd akdVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(akdVar, j, obj, obj2)) {
            if (unsafe.getObject(akdVar, j) != obj && unsafe.getObject(akdVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

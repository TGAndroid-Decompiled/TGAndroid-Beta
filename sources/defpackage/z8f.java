package defpackage;

import sun.misc.Unsafe;
public abstract class z8f {
    public static boolean a(Unsafe unsafe, lgf lgfVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(lgfVar, j, obj, obj2)) {
            if (unsafe.getObject(lgfVar, j) != obj && unsafe.getObject(lgfVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

package defpackage;

import sun.misc.Unsafe;
public abstract class i6f {
    public static boolean a(Unsafe unsafe, wdf wdfVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(wdfVar, j, obj, obj2)) {
            if (unsafe.getObject(wdfVar, j) != obj && unsafe.getObject(wdfVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

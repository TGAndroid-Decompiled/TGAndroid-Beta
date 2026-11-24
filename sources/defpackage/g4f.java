package defpackage;

import sun.misc.Unsafe;
public abstract class g4f {
    public static boolean a(Unsafe unsafe, vbf vbfVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(vbfVar, j, obj, obj2)) {
            if (unsafe.getObject(vbfVar, j) != obj && unsafe.getObject(vbfVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

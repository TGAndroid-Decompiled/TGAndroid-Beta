package defpackage;

import sun.misc.Unsafe;
public abstract class a3f {
    public static boolean a(Unsafe unsafe, cmd cmdVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(cmdVar, j, obj, obj2)) {
            if (unsafe.getObject(cmdVar, j) != obj && unsafe.getObject(cmdVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

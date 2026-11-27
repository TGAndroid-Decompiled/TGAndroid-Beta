package defpackage;

import sun.misc.Unsafe;
public abstract class r5f {
    public static boolean a(Unsafe unsafe, rod rodVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(rodVar, j, obj, obj2)) {
            if (unsafe.getObject(rodVar, j) != obj && unsafe.getObject(rodVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

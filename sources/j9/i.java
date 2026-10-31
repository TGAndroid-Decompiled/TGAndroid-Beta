package j9;

import sun.misc.Unsafe;
public abstract class i {
    public static boolean a(Unsafe unsafe, o oVar, long j10, n nVar, n nVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j10, nVar, nVar2)) {
            if (unsafe.getObject(oVar, j10) != nVar) {
                return false;
            }
        }
        return true;
    }
}

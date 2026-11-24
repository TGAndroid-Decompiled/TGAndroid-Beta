package defpackage;

import sun.misc.Unsafe;
public abstract class lsd {
    public static final vb1 a(px2 px2Var) {
        Unsafe unsafe;
        vb1 vb1Var;
        vb1 vb1Var2;
        if (!(px2Var instanceof rp3)) {
            return new vb1(1, px2Var);
        }
        rp3 rp3Var = (rp3) px2Var;
        long j = rp3.n;
        loop0: while (true) {
            unsafe = fy.a;
            Object objectVolatile = unsafe.getObjectVolatile(rp3Var, j);
            vb1Var = null;
            du2 du2Var = r5c.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(rp3Var, j, du2Var);
                vb1Var2 = null;
                break;
            } else if (objectVolatile instanceof vb1) {
                do {
                    unsafe = fy.a;
                    if (unsafe.compareAndSwapObject(rp3Var, rp3.n, objectVolatile, du2Var)) {
                        vb1Var2 = (vb1) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(rp3Var, j) == objectVolatile);
            } else if (objectVolatile != du2Var && !(objectVolatile instanceof Throwable)) {
                zo4.p(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (vb1Var2 != null) {
            long j2 = vb1.n;
            Object objectVolatile2 = unsafe.getObjectVolatile(vb1Var2, j2);
            if ((objectVolatile2 instanceof oq2) && ((oq2) objectVolatile2).d != null) {
                vb1Var2.n();
            } else {
                unsafe.putIntVolatile(vb1Var2, vb1.f, 536870911);
                unsafe.putObjectVolatile(vb1Var2, j2, h9.a);
                vb1Var = vb1Var2;
            }
            if (vb1Var != null) {
                return vb1Var;
            }
        }
        return new vb1(2, px2Var);
    }
}

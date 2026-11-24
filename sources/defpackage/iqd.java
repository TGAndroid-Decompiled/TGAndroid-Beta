package defpackage;

import sun.misc.Unsafe;
public abstract class iqd {
    public static final na1 a(fw2 fw2Var) {
        Unsafe unsafe;
        na1 na1Var;
        na1 na1Var2;
        if (!(fw2Var instanceof ho3)) {
            return new na1(1, fw2Var);
        }
        ho3 ho3Var = (ho3) fw2Var;
        long j = ho3.n;
        loop0: while (true) {
            unsafe = ex.a;
            Object objectVolatile = unsafe.getObjectVolatile(ho3Var, j);
            na1Var = null;
            lo5 lo5Var = r3c.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(ho3Var, j, lo5Var);
                na1Var2 = null;
                break;
            } else if (objectVolatile instanceof na1) {
                do {
                    unsafe = ex.a;
                    if (unsafe.compareAndSwapObject(ho3Var, ho3.n, objectVolatile, lo5Var)) {
                        na1Var2 = (na1) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(ho3Var, j) == objectVolatile);
            } else if (objectVolatile != lo5Var && !(objectVolatile instanceof Throwable)) {
                wn4.n(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (na1Var2 != null) {
            long j2 = na1.n;
            Object objectVolatile2 = unsafe.getObjectVolatile(na1Var2, j2);
            if ((objectVolatile2 instanceof dp2) && ((dp2) objectVolatile2).d != null) {
                na1Var2.n();
            } else {
                unsafe.putIntVolatile(na1Var2, na1.f, 536870911);
                unsafe.putObjectVolatile(na1Var2, j2, h9.a);
                na1Var = na1Var2;
            }
            if (na1Var != null) {
                return na1Var;
            }
        }
        return new na1(2, fw2Var);
    }
}

package defpackage;

import sun.misc.Unsafe;
public abstract class yud {
    public static final va1 a(zw2 zw2Var) {
        Unsafe unsafe;
        va1 va1Var;
        va1 va1Var2;
        if (!(zw2Var instanceof yo3)) {
            return new va1(1, zw2Var);
        }
        yo3 yo3Var = (yo3) zw2Var;
        long j = yo3.n;
        loop0: while (true) {
            unsafe = fx.a;
            Object objectVolatile = unsafe.getObjectVolatile(yo3Var, j);
            va1Var = null;
            ow5 ow5Var = q7c.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(yo3Var, j, ow5Var);
                va1Var2 = null;
                break;
            } else if (objectVolatile instanceof va1) {
                do {
                    unsafe = fx.a;
                    if (unsafe.compareAndSwapObject(yo3Var, yo3.n, objectVolatile, ow5Var)) {
                        va1Var2 = (va1) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(yo3Var, j) == objectVolatile);
            } else if (objectVolatile != ow5Var && !(objectVolatile instanceof Throwable)) {
                lq5.i(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (va1Var2 != null) {
            long j2 = va1.n;
            Object objectVolatile2 = unsafe.getObjectVolatile(va1Var2, j2);
            if ((objectVolatile2 instanceof wp2) && ((wp2) objectVolatile2).d != null) {
                va1Var2.n();
            } else {
                unsafe.putIntVolatile(va1Var2, va1.f, 536870911);
                unsafe.putObjectVolatile(va1Var2, j2, i9.a);
                va1Var = va1Var2;
            }
            if (va1Var != null) {
                return va1Var;
            }
        }
        return new va1(2, zw2Var);
    }
}

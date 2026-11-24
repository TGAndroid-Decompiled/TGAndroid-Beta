package defpackage;

import sun.misc.Unsafe;
public final class eg2 extends ft5 {
    public final na1 e;

    public eg2(na1 na1Var) {
        this.e = na1Var;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void l(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        pt5 j = j();
        na1 na1Var = this.e;
        Throwable p = na1Var.p(j);
        if (na1Var.w()) {
            ho3 ho3Var = (ho3) na1Var.d;
            long j2 = ho3.n;
            loop0: while (true) {
                Object objectVolatile = ex.a.getObjectVolatile(ho3Var, j2);
                lo5 lo5Var = r3c.b;
                if (rp5.a(objectVolatile, lo5Var)) {
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(ho3Var, ho3.n, lo5Var, p)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(ho3Var, j2) == lo5Var);
                } else if (objectVolatile instanceof Throwable) {
                    return;
                } else {
                    do {
                        unsafe2 = ex.a;
                        if (unsafe2.compareAndSwapObject(ho3Var, ho3.n, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(ho3Var, j2) == objectVolatile);
                }
            }
        }
        na1Var.m(p);
        if (!na1Var.w()) {
            na1Var.n();
        }
    }
}

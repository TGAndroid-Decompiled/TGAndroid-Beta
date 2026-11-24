package defpackage;

import sun.misc.Unsafe;
public final class io3 extends rq9 {
    public static final long f = ex.a.objectFieldOffset(io3.class.getDeclaredField("_decision$volatile"));
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    r3c.c(dle.a(this.e), zsd.a(obj));
                    return;
                } else {
                    sc8.j("Already resumed");
                    return;
                }
            }
            io3 io3Var = this;
            if (unsafe.compareAndSwapInt(io3Var, j, 0, 2)) {
                return;
            }
            this = io3Var;
        }
    }
}

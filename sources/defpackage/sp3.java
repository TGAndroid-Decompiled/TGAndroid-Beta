package defpackage;

import sun.misc.Unsafe;
public final class sp3 extends ss9 {
    public static final long f = fy.a.objectFieldOffset(sp3.class.getDeclaredField("_decision$volatile"));
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    r5c.c(fne.a(this.e), cvd.a(obj));
                    return;
                } else {
                    dq9.m("Already resumed");
                    return;
                }
            }
            sp3 sp3Var = this;
            if (unsafe.compareAndSwapInt(sp3Var, j, 0, 2)) {
                return;
            }
            this = sp3Var;
        }
    }
}

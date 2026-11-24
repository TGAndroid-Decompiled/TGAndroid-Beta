package defpackage;

import sun.misc.Unsafe;
public final class gnb extends ft5 {
    public static final long h = ex.a.objectFieldOffset(gnb.class.getDeclaredField("_state$volatile"));
    private volatile int _state$volatile;
    public final Thread e = Thread.currentThread();
    public no3 f;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1 && intVolatile != 2 && intVolatile != 3) {
                    n(intVolatile);
                    throw null;
                }
                return;
            }
            gnb gnbVar = this;
            if (unsafe.compareAndSwapInt(gnbVar, h, intVolatile, 2)) {
                gnbVar.e.interrupt();
                unsafe.putIntVolatile(gnbVar, j, 3);
                return;
            }
            this = gnbVar;
        }
    }

    public final void m() {
        gnb gnbVar;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                gnbVar = this;
            } else {
                gnbVar = this;
                if (unsafe.compareAndSwapInt(gnbVar, j, intVolatile, 1)) {
                    no3 no3Var = gnbVar.f;
                    if (no3Var != null) {
                        no3Var.dispose();
                        return;
                    }
                    return;
                }
            }
            this = gnbVar;
        }
    }
}

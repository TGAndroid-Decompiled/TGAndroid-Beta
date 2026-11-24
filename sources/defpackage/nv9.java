package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
public abstract class nv9 extends uq2 implements tj7 {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(nv9.class, "cleanedAndPointers$volatile");
    public static final long f = ex.a.objectFieldOffset(nv9.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile int cleanedAndPointers$volatile;
    public final long d;

    public nv9(long j, nv9 nv9Var, int i) {
        super(nv9Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override
    public final boolean d() {
        if (ex.a.getIntVolatile(this, f) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (e.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i, sw2 sw2Var);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            nv9 nv9Var = this;
            if (unsafe.compareAndSwapInt(nv9Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = nv9Var;
        }
    }
}

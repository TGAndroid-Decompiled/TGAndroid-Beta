package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
public abstract class qx9 extends fs2 implements wl7 {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(qx9.class, "cleanedAndPointers$volatile");
    public static final long f = fy.a.objectFieldOffset(qx9.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile int cleanedAndPointers$volatile;
    public final long d;

    public qx9(long j, qx9 qx9Var, int i) {
        super(qx9Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override
    public final boolean d() {
        if (fy.a.getIntVolatile(this, f) == g() && c() != null) {
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

    public abstract void h(int i, cy2 cy2Var);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            qx9 qx9Var = this;
            if (unsafe.compareAndSwapInt(qx9Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = qx9Var;
        }
    }
}

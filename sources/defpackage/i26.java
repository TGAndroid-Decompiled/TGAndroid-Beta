package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
public final class i26 extends vw2 implements dd3 {
    public static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(i26.class, "runningWorkers$volatile");
    public static final long r = ex.a.objectFieldOffset(i26.class.getDeclaredField("runningWorkers$volatile"));
    public final dd3 c;
    public final vw2 d;
    public final int e;
    public final rb6 f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i26(vw2 vw2Var, int i) {
        dd3 dd3Var;
        if (vw2Var instanceof dd3) {
            dd3Var = (dd3) vw2Var;
        } else {
            dd3Var = null;
        }
        this.c = dd3Var == null ? ia3.a : dd3Var;
        this.d = vw2Var;
        this.e = i;
        this.f = new rb6();
        this.h = new Object();
    }

    @Override
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
        return this.c.a(j, nobVar, sw2Var);
    }

    @Override
    public final void b(long j, na1 na1Var) {
        this.c.b(j, na1Var);
    }

    @Override
    public final void c(sw2 sw2Var, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        Unsafe unsafe = ex.a;
        long j = r;
        if (unsafe.getIntVolatile(this, j) < this.e) {
            synchronized (this.h) {
                if (unsafe.getIntVolatile(this, j) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f = f();
                if (f != null) {
                    this.d.c(this, new rld((Object) this, (Object) f, false, (byte) 6));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}

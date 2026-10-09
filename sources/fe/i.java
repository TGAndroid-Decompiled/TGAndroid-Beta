package fe;

import ae.b0;
import ae.g2;
import ae.i0;
import ae.l0;
import ae.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class i extends b0 implements l0 {
    public static final AtomicIntegerFieldUpdater f9898n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final b0 f9899c;
    public final int d;
    public final l0 f9900e;
    public final l f9901f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(b0 b0Var, int i10) {
        l0 l0Var;
        this.f9899c = b0Var;
        this.d = i10;
        if (b0Var instanceof l0) {
            l0Var = (l0) b0Var;
        } else {
            l0Var = null;
        }
        this.f9900e = l0Var == null ? i0.f465a : l0Var;
        this.f9901f = new l();
        this.h = new Object();
    }

    @Override
    public final q0 a(long j3, g2 g2Var, jd.h hVar) {
        return this.f9900e.a(j3, g2Var, hVar);
    }

    @Override
    public final void b(long j3, ae.m mVar) {
        this.f9900e.b(j3, mVar);
    }

    @Override
    public final void c(jd.h hVar, Runnable runnable) {
        this.f9901f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9898n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f9899c.c(this, new i9.s(this, f7, false, 14));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f9901f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9898n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f9901f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}

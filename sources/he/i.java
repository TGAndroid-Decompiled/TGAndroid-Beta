package he;

import ce.a0;
import ce.f2;
import ce.h0;
import ce.k0;
import ce.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class i extends a0 implements k0 {
    public static final AtomicIntegerFieldUpdater f12802n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f12803c;
    public final int d;
    public final k0 e;
    public final l f12804f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        k0 k0Var;
        this.f12803c = a0Var;
        this.d = i10;
        if (a0Var instanceof k0) {
            k0Var = (k0) a0Var;
        } else {
            k0Var = null;
        }
        this.e = k0Var == null ? h0.f6233a : k0Var;
        this.f12804f = new l();
        this.h = new Object();
    }

    @Override
    public final void a(long j10, ce.m mVar) {
        this.e.a(j10, mVar);
    }

    @Override
    public final p0 b(long j10, f2 f2Var, ld.h hVar) {
        return this.e.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(ld.h hVar, Runnable runnable) {
        this.f12804f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12802n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f12803c.c(this, new k9.u(this, f7, false, 16));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f12804f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12802n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f12804f.c() == 0) {
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

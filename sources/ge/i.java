package ge;

import be.a0;
import be.f2;
import be.h0;
import be.k0;
import be.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class i extends a0 implements k0 {
    public static final AtomicIntegerFieldUpdater f11025n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f11026c;
    public final int d;
    public final k0 e;
    public final l f11027f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        k0 k0Var;
        this.f11026c = a0Var;
        this.d = i10;
        if (a0Var instanceof k0) {
            k0Var = (k0) a0Var;
        } else {
            k0Var = null;
        }
        this.e = k0Var == null ? h0.f4294a : k0Var;
        this.f11027f = new l();
        this.h = new Object();
    }

    @Override
    public final void a(long j10, be.m mVar) {
        this.e.a(j10, mVar);
    }

    @Override
    public final p0 b(long j10, f2 f2Var, kd.h hVar) {
        return this.e.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(kd.h hVar, Runnable runnable) {
        this.f11027f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11025n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f11026c.c(this, new j9.u(this, f7, false, 16));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f11027f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11025n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f11027f.c() == 0) {
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

package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wd.d0;
import wd.g0;
import wd.l0;
import wd.x;
import wd.y1;
public final class g extends x implements g0 {
    public static final AtomicIntegerFieldUpdater f3265n = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final g0 f3266c;
    public final x d;
    public final int f3267e;
    public final k f3268f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public g(x xVar, int i3) {
        g0 g0Var;
        if (xVar instanceof g0) {
            g0Var = (g0) xVar;
        } else {
            g0Var = null;
        }
        this.f3266c = g0Var == null ? d0.f57480a : g0Var;
        this.d = xVar;
        this.f3267e = i3;
        this.f3268f = new k();
        this.h = new Object();
    }

    @Override
    public final void a(long j10, wd.m mVar) {
        this.f3266c.a(j10, mVar);
    }

    @Override
    public final l0 b(long j10, y1 y1Var, fd.h hVar) {
        return this.f3266c.b(j10, y1Var, hVar);
    }

    @Override
    public final void c(fd.h hVar, Runnable runnable) {
        this.f3268f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3265n;
        if (atomicIntegerFieldUpdater.get(this) < this.f3267e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f3267e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable g7 = g();
                if (g7 != null) {
                    this.d.c(this, new l9.u(this, g7, false, 2));
                }
            }
        }
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.f3268f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3265n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f3268f.c() == 0) {
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
        return this.d + ".limitedParallelism(" + this.f3267e + ')';
    }
}

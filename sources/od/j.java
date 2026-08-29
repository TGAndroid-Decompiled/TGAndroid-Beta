package od;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jd.a0;
import jd.e2;
import jd.g0;
import jd.j0;
import jd.o0;
public final class j extends a0 implements j0 {
    public static final AtomicIntegerFieldUpdater f19519n = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers$volatile");
    public final a0 f19520c;
    public final int d;
    public final j0 f19521e;
    public final m f19522f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public j(a0 a0Var, int i10) {
        j0 j0Var;
        this.f19520c = a0Var;
        this.d = i10;
        if (a0Var instanceof j0) {
            j0Var = (j0) a0Var;
        } else {
            j0Var = null;
        }
        this.f19521e = j0Var == null ? g0.f11480a : j0Var;
        this.f19522f = new m();
        this.h = new Object();
    }

    @Override
    public final o0 a(long j10, e2 e2Var, sc.h hVar) {
        return this.f19521e.a(j10, e2Var, hVar);
    }

    @Override
    public final void b(long j10, jd.m mVar) {
        this.f19521e.b(j10, mVar);
    }

    @Override
    public final void c(sc.h hVar, Runnable runnable) {
        this.f19522f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19519n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f9 = f();
                if (f9 != null) {
                    this.f19520c.c(this, new i(0, this, f9));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f19522f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19519n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f19522f.c() == 0) {
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

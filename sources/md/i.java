package md;

import hd.a0;
import hd.f2;
import hd.h0;
import hd.k0;
import hd.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class i extends a0 implements k0 {
    public static final AtomicIntegerFieldUpdater f17653n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f17654c;
    public final int d;
    public final k0 f17655e;
    public final l f17656f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i9) {
        k0 k0Var;
        this.f17654c = a0Var;
        this.d = i9;
        if (a0Var instanceof k0) {
            k0Var = (k0) a0Var;
        } else {
            k0Var = null;
        }
        this.f17655e = k0Var == null ? h0.f10447a : k0Var;
        this.f17656f = new l();
        this.h = new Object();
    }

    @Override
    public final p0 a(long j10, f2 f2Var, qc.h hVar) {
        return this.f17655e.a(j10, f2Var, hVar);
    }

    @Override
    public final void b(long j10, hd.m mVar) {
        this.f17655e.b(j10, mVar);
    }

    @Override
    public final void c(qc.h hVar, Runnable runnable) {
        this.f17656f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17653n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f10 = f();
                if (f10 != null) {
                    this.f17654c.c(this, new androidx.biometric.j(23, this, f10));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f17656f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17653n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f17656f.c() == 0) {
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

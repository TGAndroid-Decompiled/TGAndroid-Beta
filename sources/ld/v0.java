package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class v0 extends w0 implements j0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f12369n = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f12370r = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    public o0 a(long j10, e2 e2Var, uc.h hVar) {
        return g0.f12316a.a(j10, e2Var, hVar);
    }

    @Override
    public final void b(long j10, m mVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j11 + nanoTime, mVar);
            o(nanoTime, r0Var);
            mVar.v(new j(r0Var, 2));
        }
    }

    @Override
    public final void c(uc.h hVar, Runnable runnable) {
        l(runnable);
    }

    @Override
    public final long i() {
        throw new UnsupportedOperationException("Method not decompiled: ld.v0.i():long");
    }

    public void l(Runnable runnable) {
        if (m(runnable)) {
            Thread g10 = g();
            if (Thread.currentThread() != g10) {
                LockSupport.unpark(g10);
                return;
            }
            return;
        }
        f0.f12311s.l(runnable);
    }

    public final boolean m(java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: ld.v0.m(java.lang.Runnable):boolean");
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: ld.v0.n():boolean");
    }

    public final void o(long j10, t0 t0Var) {
        int c3;
        Thread g10;
        int i10 = f12370r.get(this);
        t0 t0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12369n;
        if (i10 != 0) {
            c3 = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                ?? obj = new Object();
                obj.f12364c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj2);
                u0Var = (u0) obj2;
            }
            c3 = t0Var.c(j10, u0Var, this);
        }
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            k(j10, t0Var);
            return;
        }
        u0 u0Var2 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var2 != null) {
            t0Var2 = u0Var2.b();
        }
        if (t0Var2 == t0Var && Thread.currentThread() != (g10 = g())) {
            LockSupport.unpark(g10);
        }
    }

    @Override
    public void shutdown() {
        t0 t0Var;
        c2.f12289a.set(null);
        f12370r.set(this, 1);
        com.google.android.gms.internal.clearcut.e eVar = e0.f12298c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof qd.n) {
                ((qd.n) obj).b();
                break;
            } else if (obj != eVar) {
                qd.n nVar = new qd.n(8, true);
                nVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (i() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) f12369n.get(this);
            if (u0Var != null) {
                synchronized (u0Var) {
                    if (qd.x.f44826b.get(u0Var) > 0) {
                        t0Var = u0Var.d(0);
                    } else {
                        t0Var = null;
                    }
                }
                if (t0Var != null) {
                    k(nanoTime, t0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

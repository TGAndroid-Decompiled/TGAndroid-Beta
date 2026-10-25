package ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class w0 extends x0 implements k0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f6275n = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f6276r = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    @Override
    public final void a(long j10, m mVar) {
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
            s0 s0Var = new s0(this, j11 + nanoTime, mVar);
            o(nanoTime, s0Var);
            mVar.v(new j(s0Var, 2));
        }
    }

    public p0 b(long j10, f2 f2Var, ld.h hVar) {
        return h0.f6233a.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(ld.h hVar, Runnable runnable) {
        l(runnable);
    }

    @Override
    public final long i() {
        throw new UnsupportedOperationException("Method not decompiled: ce.w0.i():long");
    }

    public void l(Runnable runnable) {
        if (m(runnable)) {
            Thread g7 = g();
            if (Thread.currentThread() != g7) {
                LockSupport.unpark(g7);
                return;
            }
            return;
        }
        g0.f6231s.l(runnable);
    }

    public final boolean m(java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: ce.w0.m(java.lang.Runnable):boolean");
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: ce.w0.n():boolean");
    }

    public final void o(long j10, u0 u0Var) {
        int c10;
        Thread g7;
        int i10 = f6276r.get(this);
        u0 u0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6275n;
        if (i10 != 0) {
            c10 = 1;
        } else {
            v0 v0Var = (v0) atomicReferenceFieldUpdater.get(this);
            if (v0Var == null) {
                ?? obj = new Object();
                obj.f6272c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj2);
                v0Var = (v0) obj2;
            }
            c10 = u0Var.c(j10, v0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            k(j10, u0Var);
            return;
        }
        v0 v0Var2 = (v0) atomicReferenceFieldUpdater.get(this);
        if (v0Var2 != null) {
            u0Var2 = v0Var2.b();
        }
        if (u0Var2 == u0Var && Thread.currentThread() != (g7 = g())) {
            LockSupport.unpark(g7);
        }
    }

    @Override
    public void shutdown() {
        u0 u0Var;
        d2.f6213a.set(null);
        f6276r.set(this, 1);
        he.v vVar = f0.f6222c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof he.n) {
                ((he.n) obj).b();
                break;
            } else if (obj != vVar) {
                he.n nVar = new he.n(8, true);
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
            v0 v0Var = (v0) f6275n.get(this);
            if (v0Var != null) {
                synchronized (v0Var) {
                    if (he.y.f12825b.get(v0Var) > 0) {
                        u0Var = v0Var.d(0);
                    } else {
                        u0Var = null;
                    }
                }
                if (u0Var != null) {
                    k(nanoTime, u0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

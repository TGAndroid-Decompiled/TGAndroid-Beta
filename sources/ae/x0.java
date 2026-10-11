package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class x0 extends y0 implements l0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f516n = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f517r = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    public q0 a(long j3, g2 g2Var, jd.h hVar) {
        return i0.f465a.a(j3, g2Var, hVar);
    }

    @Override
    public final void b(long j3, m mVar) {
        long j10 = 0;
        if (j3 > 0) {
            if (j3 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j3;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            t0 t0Var = new t0(this, j10 + nanoTime, mVar);
            o(nanoTime, t0Var);
            mVar.v(new j(t0Var, 2));
        }
    }

    @Override
    public final void c(jd.h hVar, Runnable runnable) {
        l(runnable);
    }

    @Override
    public final long i() {
        throw new UnsupportedOperationException("Method not decompiled: ae.x0.i():long");
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
        h0.f462s.l(runnable);
    }

    public final boolean m(java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: ae.x0.m(java.lang.Runnable):boolean");
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: ae.x0.n():boolean");
    }

    public final void o(long j3, v0 v0Var) {
        int c10;
        Thread g10;
        int i10 = f517r.get(this);
        v0 v0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f516n;
        if (i10 != 0) {
            c10 = 1;
        } else {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
            if (w0Var == null) {
                ?? obj = new Object();
                obj.f513c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj2);
                w0Var = (w0) obj2;
            }
            c10 = v0Var.c(j3, w0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            k(j3, v0Var);
            return;
        }
        w0 w0Var2 = (w0) atomicReferenceFieldUpdater.get(this);
        if (w0Var2 != null) {
            v0Var2 = w0Var2.b();
        }
        if (v0Var2 == v0Var && Thread.currentThread() != (g10 = g())) {
            LockSupport.unpark(g10);
        }
    }

    @Override
    public void shutdown() {
        v0 v0Var;
        e2.f441a.set(null);
        f517r.set(this, 1);
        da.a aVar = g0.f452c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof fe.n) {
                ((fe.n) obj).b();
                break;
            } else if (obj != aVar) {
                fe.n nVar = new fe.n(8, true);
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
            w0 w0Var = (w0) f516n.get(this);
            if (w0Var != null) {
                synchronized (w0Var) {
                    if (fe.x.f9920b.get(w0Var) > 0) {
                        v0Var = w0Var.d(0);
                    } else {
                        v0Var = null;
                    }
                }
                if (v0Var != null) {
                    k(nanoTime, v0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

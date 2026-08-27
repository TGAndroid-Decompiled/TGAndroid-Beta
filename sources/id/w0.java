package id;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class w0 extends x0 implements k0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");

    public static final AtomicReferenceFieldUpdater f11208n = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");

    public static final AtomicIntegerFieldUpdater f11209r = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    @Override
    public final void a(long j10, m mVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            s0 s0Var = new s0(this, j11 + jNanoTime, mVar);
            o(jNanoTime, s0Var);
            mVar.v(new j(s0Var, 2));
        }
    }

    public p0 b(long j10, f2 f2Var, rc.h hVar) {
        return h0.f11156a.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(rc.h hVar, Runnable runnable) {
        l(runnable);
    }

    @Override
    public final long i() {
        u0 u0VarB;
        u0 u0VarD;
        if (!j()) {
            v0 v0Var = (v0) f11208n.get(this);
            Runnable runnable = null;
            if (v0Var != null && nd.x.f18512b.get(v0Var) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (v0Var) {
                        try {
                            u0[] u0VarArr = v0Var.f18513a;
                            u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                            if (u0Var == null) {
                                u0VarD = null;
                            } else {
                                u0VarD = ((jNanoTime - u0Var.f11200a) > 0L ? 1 : ((jNanoTime - u0Var.f11200a) == 0L ? 0 : -1)) >= 0 ? m(u0Var) : false ? v0Var.d(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (u0VarD != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (obj instanceof nd.n) {
                    nd.n nVar = (nd.n) obj;
                    Object objD = nVar.d();
                    if (objD != nd.n.f18500g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    nd.n nVarC = nVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == f0.f11141c) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            qc.e eVar = this.f11214e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = h.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof nd.n) {
                        long j10 = nd.n.f18499f.get((nd.n) obj2);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == f0.f11141c) {
                        return Long.MAX_VALUE;
                    }
                }
                v0 v0Var2 = (v0) f11208n.get(this);
                if (v0Var2 != null && (u0VarB = v0Var2.b()) != null) {
                    long jNanoTime2 = u0VarB.f11200a - System.nanoTime();
                    if (jNanoTime2 >= 0) {
                        return jNanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void l(Runnable runnable) {
        if (!m(runnable)) {
            g0.f11153s.l(runnable);
            return;
        }
        Thread threadG = g();
        if (Thread.currentThread() != threadG) {
            LockSupport.unpark(threadG);
        }
    }

    public final boolean m(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f11209r.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof nd.n)) {
                if (obj == f0.f11141c) {
                    return false;
                }
                nd.n nVar = new nd.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            nd.n nVar2 = (nd.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                nd.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean n() {
        Object obj;
        long j10;
        qc.e eVar = this.f11214e;
        if (eVar != null ? eVar.isEmpty() : true) {
            v0 v0Var = (v0) f11208n.get(this);
            if (v0Var == null) {
                obj = h.get(this);
                if (obj != null) {
                    if (obj instanceof nd.n) {
                        j10 = nd.n.f18499f.get((nd.n) obj);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == f0.f11141c) {
                    }
                }
                return true;
            }
            if (nd.x.f18512b.get(v0Var) == 0) {
                obj = h.get(this);
                if (obj != null) {
                    if (obj instanceof nd.n) {
                        j10 = nd.n.f18499f.get((nd.n) obj);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == f0.f11141c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void o(long j10, u0 u0Var) {
        int iC;
        Thread threadG;
        int i10 = f11209r.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11208n;
        if (i10 != 0) {
            iC = 1;
        } else {
            v0 v0Var = (v0) atomicReferenceFieldUpdater.get(this);
            if (v0Var == null) {
                v0 v0Var2 = new v0();
                v0Var2.f11205c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, v0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj);
                v0Var = (v0) obj;
            }
            iC = u0Var.c(j10, v0Var, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                k(j10, u0Var);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        v0 v0Var3 = (v0) atomicReferenceFieldUpdater.get(this);
        if ((v0Var3 != null ? v0Var3.b() : null) != u0Var || Thread.currentThread() == (threadG = g())) {
            return;
        }
        LockSupport.unpark(threadG);
    }

    @Override
    public void shutdown() {
        u0 u0VarD;
        d2.f11131a.set(null);
        f11209r.set(this, 1);
        ec.a aVar = f0.f11141c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof nd.n) {
                ((nd.n) obj).b();
                break;
            } else {
                if (obj == aVar) {
                    break;
                }
                nd.n nVar = new nd.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (i() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            v0 v0Var = (v0) f11208n.get(this);
            if (v0Var == null) {
                return;
            }
            synchronized (v0Var) {
                u0VarD = nd.x.f18512b.get(v0Var) > 0 ? v0Var.d(0) : null;
            }
            if (u0VarD == null) {
                return;
            } else {
                k(jNanoTime, u0VarD);
            }
        }
    }
}

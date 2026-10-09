package he;

import ae.g0;
import fe.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import org.telegram.ui.Cells.c1;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f11105n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f11106r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f11107s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final da.a v = new da.a("NOT_IN_STACK");
    private volatile int _isTerminated$volatile;
    public final int f11108a;
    public final int f11109b;
    public final long f11110c;
    private volatile long controlState$volatile;
    public final String d;
    public final f f11111e;
    public final f f11112f;
    public final r h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i10, long j3, String str, int i11) {
        this.f11108a = i10;
        this.f11109b = i11;
        this.f11110c = j3;
        this.d = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j3 > 0) {
                        this.f11111e = new fe.l();
                        this.f11112f = new fe.l();
                        this.h = new r((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(c1.h(j3, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(hg.c.i(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(a1.g.m(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(hg.c.i(i10, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.h) {
            try {
                if (f11107s.get(this) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f11106r;
                long j3 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j3 & 2097151);
                int i11 = i10 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f11108a) {
                    return 0;
                }
                if (i10 >= this.f11109b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 > 0 && this.h.b(i12) == null) {
                    a aVar = new a(this, i12);
                    this.h.c(i12, aVar);
                    if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i13 = i11 + 1;
                        aVar.start();
                        return i13;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, com.google.android.gms.internal.cast.a aVar) {
        i jVar;
        boolean z10;
        long j3;
        a aVar2;
        boolean a2;
        b bVar;
        k.f11123f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f11116a = nanoTime;
            jVar.f11117b = aVar;
        } else {
            jVar = new j(runnable, nanoTime, aVar);
        }
        if (jVar.f11117b.f6763a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11106r;
        if (z10) {
            j3 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j3 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar2 = (a) currentThread;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null || !kotlin.jvm.internal.i.a(aVar2.f11099n, this)) {
            aVar2 = null;
        }
        if (aVar2 != null && (bVar = aVar2.f11096c) != b.f11103e && (jVar.f11117b.f6763a != 0 || bVar != b.f11101b)) {
            aVar2.h = true;
            m mVar = aVar2.f11094a;
            mVar.getClass();
            jVar = (i) m.f11126b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f11129a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f11127c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f11117b.f6763a == 1) {
                        m.f11128e.incrementAndGet(mVar);
                    }
                    int i10 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i10) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i10, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (jVar.f11117b.f6763a == 1) {
                a2 = this.f11112f.a(jVar);
            } else {
                a2 = this.f11111e.a(jVar);
            }
            if (!a2) {
                throw new RejectedExecutionException(a1.g.t(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z10) {
            if (!e() && !d(j3)) {
                e();
            }
        } else if (e() || d(atomicLongFieldUpdater.get(this))) {
        } else {
            e();
        }
    }

    public final void c(a aVar, int i10, int i11) {
        while (true) {
            long j3 = f11105n.get(this);
            int i12 = (int) (2097151 & j3);
            long j10 = (2097152 + j3) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == v) {
                            i12 = -1;
                            break;
                        } else if (c10 == null) {
                            i12 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c10;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i12 = b10;
                                break;
                            }
                            c10 = aVar2.c();
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f11105n.compareAndSet(this, j3, i12 | j10)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: he.c.close():void");
    }

    public final boolean d(long j3) {
        int i10 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f11108a;
        if (i10 < i11) {
            int a2 = a();
            if (a2 == 1 && i11 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        da.a aVar;
        int i10;
        while (true) {
            long j3 = f11105n.get(this);
            a aVar2 = (a) this.h.b((int) (2097151 & j3));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j10 = (2097152 + j3) & (-2097152);
                Object c10 = aVar2.c();
                while (true) {
                    aVar = v;
                    if (c10 == aVar) {
                        i10 = -1;
                        break;
                    } else if (c10 == null) {
                        i10 = 0;
                        break;
                    } else {
                        a aVar3 = (a) c10;
                        i10 = aVar3.b();
                        if (i10 != 0) {
                            break;
                        }
                        c10 = aVar3.c();
                    }
                }
                if (i10 >= 0) {
                    if (f11105n.compareAndSet(this, j3, i10 | j10)) {
                        aVar2.h(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f11093r.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f11124g);
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        r rVar = this.h;
        int a2 = rVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a2; i16++) {
            a aVar = (a) rVar.b(i16);
            if (aVar != null) {
                m mVar = aVar.f11094a;
                mVar.getClass();
                if (m.f11126b.get(mVar) != null) {
                    i10 = (m.f11127c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i10 = m.f11127c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f11096c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (i10 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i10);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i10);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j3 = f11106r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(g0.k(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f11108a;
        sb5.append(i17);
        sb5.append(", max = ");
        hg.c.u(sb5, this.f11109b, "}, Worker States {CPU = ", i11, ", blocking = ");
        hg.c.u(sb5, i12, ", parked = ", i13, ", dormant = ");
        hg.c.u(sb5, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f11111e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f11112f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j3));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j3) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}

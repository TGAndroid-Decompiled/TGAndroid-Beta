package ge;

import a8.p0;
import ee.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import zd.b0;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f13842n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f13843r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f13844s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final com.google.android.gms.internal.clearcut.e f13845w = new com.google.android.gms.internal.clearcut.e("NOT_IN_STACK", 1);
    private volatile int _isTerminated$volatile;
    public final int f13846a;
    public final int f13847b;
    public final long f13848c;
    private volatile long controlState$volatile;
    public final String d;
    public final f f13849e;
    public final f f13850f;
    public final p h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i7, long j3, String str, int i10) {
        this.f13846a = i7;
        this.f13847b = i10;
        this.f13848c = j3;
        this.d = str;
        if (i7 >= 1) {
            if (i10 >= i7) {
                if (i10 <= 2097150) {
                    if (j3 > 0) {
                        this.f13849e = new ee.k();
                        this.f13850f = new ee.k();
                        this.h = new p((i7 + 1) * 2);
                        this.controlState$volatile = i7 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(rf.b.h(j3, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(jg.g.k(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(p0.m(i10, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(jg.g.k(i7, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z9;
        synchronized (this.h) {
            try {
                if (f13844s.get(this) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f13843r;
                long j3 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j3 & 2097151);
                int i10 = i7 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f13846a) {
                    return 0;
                }
                if (i7 >= this.f13847b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.h.b(i11) == null) {
                    a aVar = new a(this, i11);
                    this.h.c(i11, aVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = i10 + 1;
                        aVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, boolean z9) {
        i jVar;
        long j3;
        a aVar;
        boolean a10;
        b bVar;
        k.f13861f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f13854a = nanoTime;
            jVar.f13855b = z9;
        } else {
            jVar = new j(nanoTime, z9, runnable);
        }
        boolean z10 = jVar.f13855b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f13843r;
        if (z10) {
            j3 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j3 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f13836n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f13833c) != b.f13840e && (jVar.f13855b || bVar != b.f13838b)) {
            aVar.h = true;
            m mVar = aVar.f13831a;
            mVar.getClass();
            jVar = (i) m.f13863b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f13866a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f13864c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f13855b) {
                        m.f13865e.incrementAndGet(mVar);
                    }
                    int i7 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i7) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i7, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (jVar.f13855b) {
                a10 = this.f13850f.a(jVar);
            } else {
                a10 = this.f13849e.a(jVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(p0.s(new StringBuilder(), this.d, " was terminated"));
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

    public final void c(a aVar, int i7, int i10) {
        while (true) {
            long j3 = f13842n.get(this);
            int i11 = (int) (2097151 & j3);
            long j10 = (2097152 + j3) & (-2097152);
            if (i11 == i7) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == f13845w) {
                            i11 = -1;
                            break;
                        } else if (c10 == null) {
                            i11 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c10;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i11 = b10;
                                break;
                            }
                            c10 = aVar2.c();
                        }
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f13842n.compareAndSet(this, j3, i11 | j10)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: ge.c.close():void");
    }

    public final boolean d(long j3) {
        int i7 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = this.f13846a;
        if (i7 < i10) {
            int a10 = a();
            if (a10 == 1 && i10 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        com.google.android.gms.internal.clearcut.e eVar;
        int i7;
        while (true) {
            long j3 = f13842n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j3) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    eVar = f13845w;
                    if (c10 == eVar) {
                        i7 = -1;
                        break;
                    } else if (c10 == null) {
                        i7 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c10;
                        i7 = aVar2.b();
                        if (i7 != 0) {
                            break;
                        }
                        c10 = aVar2.c();
                    }
                }
                if (i7 >= 0) {
                    if (f13842n.compareAndSet(this, j3, i7 | j10)) {
                        aVar.h(eVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f13830r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        int i7;
        ArrayList arrayList = new ArrayList();
        p pVar = this.h;
        int a10 = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f13831a;
                mVar.getClass();
                if (m.f13863b.get(mVar) != null) {
                    i7 = (m.f13864c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i7 = m.f13864c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f13833c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i14++;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                i13++;
                                if (i7 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i7);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i11++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i7);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j3 = f13843r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(b0.j(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f13846a;
        sb5.append(i16);
        sb5.append(", max = ");
        jg.g.x(sb5, this.f13847b, "}, Worker States {CPU = ", i10, ", blocking = ");
        jg.g.x(sb5, i11, ", parked = ", i12, ", dormant = ");
        jg.g.x(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f13849e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f13850f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j3));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j3) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}

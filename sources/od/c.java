package od;

import hd.f0;
import j3.r0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import md.r;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f19210n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f19211r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f19212s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final e5.c v = new e5.c("NOT_IN_STACK", 2);
    private volatile int _isTerminated$volatile;
    public final int f19213a;
    public final int f19214b;
    public final long f19215c;
    private volatile long controlState$volatile;
    public final String d;
    public final f f19216e;
    public final f f19217f;
    public final r h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i9, long j10, String str, int i10) {
        this.f19213a = i9;
        this.f19214b = i10;
        this.f19215c = j10;
        this.d = str;
        if (i9 >= 1) {
            if (i10 >= i9) {
                if (i10 <= 2097150) {
                    if (j10 > 0) {
                        this.f19216e = new md.l();
                        this.f19217f = new md.l();
                        this.h = new r((i9 + 1) * 2);
                        this.controlState$volatile = i9 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(aa.d.n(j10, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(r0.m(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(aa.d.k(i10, i9, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(r0.m(i9, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.h) {
            try {
                if (f19212s.get(this) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f19211r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i9 = (int) (j10 & 2097151);
                int i10 = i9 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f19213a) {
                    return 0;
                }
                if (i9 >= this.f19214b) {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, com.google.android.gms.internal.cast.a aVar) {
        i jVar;
        boolean z10;
        long j10;
        a aVar2;
        boolean a2;
        b bVar;
        k.f19228f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f19221a = nanoTime;
            jVar.f19222b = aVar;
        } else {
            jVar = new j(runnable, nanoTime, aVar);
        }
        if (jVar.f19222b.f2981a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19211r;
        if (z10) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar2 = (a) currentThread;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null || !kotlin.jvm.internal.i.a(aVar2.f19204n, this)) {
            aVar2 = null;
        }
        if (aVar2 != null && (bVar = aVar2.f19201c) != b.f19208e && (jVar.f19222b.f2981a != 0 || bVar != b.f19206b)) {
            aVar2.h = true;
            m mVar = aVar2.f19199a;
            mVar.getClass();
            jVar = (i) m.f19231b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f19234a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f19232c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f19222b.f2981a == 1) {
                        m.f19233e.incrementAndGet(mVar);
                    }
                    int i9 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i9) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i9, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (jVar.f19222b.f2981a == 1) {
                a2 = this.f19217f.a(jVar);
            } else {
                a2 = this.f19216e.a(jVar);
            }
            if (!a2) {
                throw new RejectedExecutionException(aa.d.r(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z10) {
            if (!e() && !d(j10)) {
                e();
            }
        } else if (e() || d(atomicLongFieldUpdater.get(this))) {
        } else {
            e();
        }
    }

    public final void c(a aVar, int i9, int i10) {
        while (true) {
            long j10 = f19210n.get(this);
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i11 == i9) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == v) {
                            i11 = -1;
                            break;
                        } else if (c10 == null) {
                            i11 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c10;
                            i11 = aVar2.b();
                            if (i11 != 0) {
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
                if (f19210n.compareAndSet(this, j10, j11 | i11)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: od.c.close():void");
    }

    public final boolean d(long j10) {
        int i9 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = this.f19213a;
        if (i9 < i10) {
            int a2 = a();
            if (a2 == 1 && i10 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        e5.c cVar;
        int i9;
        while (true) {
            long j10 = f19210n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    cVar = v;
                    if (c10 == cVar) {
                        i9 = -1;
                        break;
                    } else if (c10 == null) {
                        i9 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c10;
                        i9 = aVar2.b();
                        if (i9 != 0) {
                            break;
                        }
                        c10 = aVar2.c();
                    }
                }
                if (i9 >= 0) {
                    if (f19210n.compareAndSet(this, j10, i9 | j11)) {
                        aVar.h(cVar);
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
            if (a.f19198r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f19229g);
    }

    public final String toString() {
        int i9;
        ArrayList arrayList = new ArrayList();
        r rVar = this.h;
        int a2 = rVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a2; i15++) {
            a aVar = (a) rVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f19199a;
                mVar.getClass();
                if (m.f19231b.get(mVar) != null) {
                    i9 = (m.f19232c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i9 = m.f19232c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f19201c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (i9 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i9);
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
                        sb3.append(i9);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i9);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j10 = f19211r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(f0.k(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f19213a;
        sb5.append(i16);
        sb5.append(", max = ");
        r0.y(sb5, this.f19214b, "}, Worker States {CPU = ", i10, ", blocking = ");
        r0.y(sb5, i11, ", parked = ", i12, ", dormant = ");
        r0.y(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f19216e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f19217f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}

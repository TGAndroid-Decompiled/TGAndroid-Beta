package je;

import c3.h0;
import ce.f0;
import he.r;
import he.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import org.telegram.ui.Components.b10;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f15591n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f15592r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f15593s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final v v = new v("NOT_IN_STACK", 0);
    private volatile int _isTerminated$volatile;
    public final int f15594a;
    public final int f15595b;
    public final long f15596c;
    private volatile long controlState$volatile;
    public final String d;
    public final f e;
    public final f f15597f;
    public final r h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i10, long j10, String str, int i11) {
        this.f15594a = i10;
        this.f15595b = i11;
        this.f15596c = j10;
        this.d = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.e = new he.l();
                        this.f15597f = new he.l();
                        this.h = new r((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(b10.i(j10, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(ic.a.j(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(a1.g.l(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(ic.a.j(i10, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.h) {
            try {
                if (f15593s.get(this) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f15592r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f15594a) {
                    return 0;
                }
                if (i10 >= this.f15595b) {
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

    public final void b(Runnable runnable, ag.j jVar) {
        i jVar2;
        boolean z10;
        long j10;
        a aVar;
        boolean a2;
        b bVar;
        k.f15607f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar2 = (i) runnable;
            jVar2.f15601a = nanoTime;
            jVar2.f15602b = jVar;
        } else {
            jVar2 = new j(runnable, nanoTime, jVar);
        }
        if (jVar2.f15602b.f1303a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15592r;
        if (z10) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f15586n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f15584c) != b.e && (jVar2.f15602b.f1303a != 0 || bVar != b.f15588b)) {
            aVar.h = true;
            m mVar = aVar.f15582a;
            mVar.getClass();
            jVar2 = (i) m.f15610b.getAndSet(mVar, jVar2);
            if (jVar2 == null) {
                jVar2 = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f15612a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f15611c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar2.f15602b.f1303a == 1) {
                        m.e.incrementAndGet(mVar);
                    }
                    int i10 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i10) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i10, jVar2);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar2 = null;
                }
            }
        }
        if (jVar2 != null) {
            if (jVar2.f15602b.f1303a == 1) {
                a2 = this.f15597f.a(jVar2);
            } else {
                a2 = this.e.a(jVar2);
            }
            if (!a2) {
                throw new RejectedExecutionException(a1.g.s(new StringBuilder(), this.d, " was terminated"));
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

    public final void c(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f15591n.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
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
                if (f15591n.compareAndSet(this, j10, i12 | j11)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: je.c.close():void");
    }

    public final boolean d(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f15594a;
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
        v vVar;
        int i10;
        while (true) {
            long j10 = f15591n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    vVar = v;
                    if (c10 == vVar) {
                        i10 = -1;
                        break;
                    } else if (c10 == null) {
                        i10 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c10;
                        i10 = aVar2.b();
                        if (i10 != 0) {
                            break;
                        }
                        c10 = aVar2.c();
                    }
                }
                if (i10 >= 0) {
                    if (f15591n.compareAndSet(this, j10, i10 | j11)) {
                        aVar.h(vVar);
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
            if (a.f15581r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f15608g);
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
                m mVar = aVar.f15582a;
                mVar.getClass();
                if (m.f15610b.get(mVar) != null) {
                    i10 = (m.f15611c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i10 = m.f15611c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f15584c.ordinal();
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
        long j10 = f15592r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(f0.k(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f15594a;
        sb5.append(i17);
        sb5.append(", max = ");
        h0.q(sb5, this.f15595b, "}, Worker States {CPU = ", i11, ", blocking = ");
        h0.q(sb5, i12, ", parked = ", i13, ", dormant = ");
        h0.q(sb5, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f15597f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}

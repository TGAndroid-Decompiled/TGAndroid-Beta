package de;

import be.p;
import be.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import k2.p1;
import wd.b0;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f8814n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f8815r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f8816s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final t f8817w = new t("NOT_IN_STACK", 0);
    private volatile int _isTerminated$volatile;
    public final int f8818a;
    public final int f8819b;
    public final long f8820c;
    private volatile long controlState$volatile;
    public final String d;
    public final f f8821e;
    public final f f8822f;
    public final p h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i3, long j10, String str, int i10) {
        this.f8818a = i3;
        this.f8819b = i10;
        this.f8820c = j10;
        this.d = str;
        if (i3 >= 1) {
            if (i10 >= i3) {
                if (i10 <= 2097150) {
                    if (j10 > 0) {
                        this.f8821e = new be.k();
                        this.f8822f = new be.k();
                        this.h = new p((i3 + 1) * 2);
                        this.controlState$volatile = i3 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(t4.c.e(j10, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(p1.j(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(a1.g.n(i10, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(p1.j(i3, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.h) {
            try {
                if (f8816s.get(this) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f8815r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j10 & 2097151);
                int i10 = i3 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f8818a) {
                    return 0;
                }
                if (i3 >= this.f8819b) {
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

    public final void b(Runnable runnable, boolean z10) {
        i jVar;
        long j10;
        a aVar;
        boolean a10;
        b bVar;
        k.f8833f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f8826a = nanoTime;
            jVar.f8827b = z10;
        } else {
            jVar = new j(nanoTime, z10, runnable);
        }
        boolean z11 = jVar.f8827b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8815r;
        if (z11) {
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
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f8808n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f8805c) != b.f8812e && (jVar.f8827b || bVar != b.f8810b)) {
            aVar.h = true;
            m mVar = aVar.f8803a;
            mVar.getClass();
            jVar = (i) m.f8835b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f8838a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f8836c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f8827b) {
                        m.f8837e.incrementAndGet(mVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i3) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (jVar.f8827b) {
                a10 = this.f8822f.a(jVar);
            } else {
                a10 = this.f8821e.a(jVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(a1.g.s(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z11) {
            if (!e() && !d(j10)) {
                e();
            }
        } else if (e() || d(atomicLongFieldUpdater.get(this))) {
        } else {
            e();
        }
    }

    public final void c(a aVar, int i3, int i10) {
        while (true) {
            long j10 = f8814n.get(this);
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i11 == i3) {
                if (i10 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f8817w) {
                            i11 = -1;
                            break;
                        } else if (c2 == null) {
                            i11 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c2;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i11 = b10;
                                break;
                            }
                            c2 = aVar2.c();
                        }
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f8814n.compareAndSet(this, j10, i11 | j11)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: de.c.close():void");
    }

    public final boolean d(long j10) {
        int i3 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i10 = this.f8818a;
        if (i3 < i10) {
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
        t tVar;
        int i3;
        while (true) {
            long j10 = f8814n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    tVar = f8817w;
                    if (c2 == tVar) {
                        i3 = -1;
                        break;
                    } else if (c2 == null) {
                        i3 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c2;
                        i3 = aVar2.b();
                        if (i3 != 0) {
                            break;
                        }
                        c2 = aVar2.c();
                    }
                }
                if (i3 >= 0) {
                    if (f8814n.compareAndSet(this, j10, i3 | j11)) {
                        aVar.h(tVar);
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
            if (a.f8802r.compareAndSet(aVar, -1, 0)) {
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
        int i3;
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
                m mVar = aVar.f8803a;
                mVar.getClass();
                if (m.f8835b.get(mVar) != null) {
                    i3 = (m.f8836c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i3 = m.f8836c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f8805c.ordinal();
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
                                if (i3 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i3);
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
                        sb3.append(i3);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i3);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j10 = f8815r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(b0.j(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f8818a;
        sb5.append(i16);
        sb5.append(", max = ");
        com.google.android.recaptcha.internal.a.r(sb5, this.f8819b, "}, Worker States {CPU = ", i10, ", blocking = ");
        com.google.android.recaptcha.internal.a.r(sb5, i11, ", parked = ", i12, ", dormant = ");
        com.google.android.recaptcha.internal.a.r(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f8821e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f8822f.c());
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

package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f10589r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f10590a;
    public final p f10591b;
    public b f10592c;
    public long d;
    public long f10593e;
    public int f10594f;
    public boolean h;
    private volatile int indexInArray;
    public final c f10595n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f10595n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f10590a = new m();
        this.f10591b = new Object();
        this.f10592c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f10594f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i f7;
        i f10;
        long j3;
        b bVar = this.f10592c;
        b bVar2 = b.f10596a;
        c cVar = this.f10595n;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f10590a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f10602r;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f10622b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f10613b.f5184a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i10 = m.d.get(mVar);
                    int i11 = m.f10623c.get(mVar);
                    while (true) {
                        if (i10 != i11 && m.f10624e.get(mVar) != 0) {
                            i11--;
                            i b10 = mVar.b(i11, true);
                            if (b10 != null) {
                                iVar = b10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f10608f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f10602r.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f10592c = b.f10596a;
        }
        if (z10) {
            if (e(cVar.f10604a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f10 = f()) != null) {
                return f10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f10622b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (f7 = f()) != null) {
                return f7;
            }
        } else {
            i f11 = f();
            if (f11 != null) {
                return f11;
            }
        }
        return j(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int e(int i10) {
        int i11 = this.f10594f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f10594f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int e7 = e(2);
        c cVar = this.f10595n;
        if (e7 == 0) {
            i iVar = (i) cVar.f10607e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f10608f.d();
        }
        i iVar2 = (i) cVar.f10608f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f10607e.d();
    }

    public final void g(int i10) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10595n.d);
        sb2.append("-worker-");
        if (i10 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i10);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        boolean z10;
        b bVar2 = this.f10592c;
        if (bVar2 == b.f10596a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f10602r.addAndGet(this.f10595n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f10592c = bVar;
        }
        return z10;
    }

    public final i j(int i10) {
        boolean z10;
        long j3;
        i iVar;
        long j10;
        long j11;
        i iVar2;
        int i11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f10602r;
        c cVar = this.f10595n;
        int i12 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i12 < 2) {
            return null;
        }
        int e7 = e(i12);
        int i13 = 0;
        long j12 = Long.MAX_VALUE;
        while (i13 < i12) {
            e7++;
            if (e7 > i12) {
                e7 = 1;
            }
            a aVar = (a) cVar.h.b(e7);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f10590a;
                if (i10 == 3) {
                    iVar = mVar.a();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.d.get(mVar);
                    int i15 = m.f10623c.get(mVar);
                    if (i10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j3 = 0;
                            if (!z10 || m.f10624e.get(mVar) != 0) {
                                int i16 = i14 + 1;
                                iVar = mVar.b(i14, z10);
                                if (iVar != null) {
                                    break;
                                }
                                i14 = i16;
                            } else {
                                break;
                            }
                        } else {
                            j3 = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                p pVar = this.f10591b;
                if (iVar != null) {
                    pVar.f15053a = iVar;
                    iVar2 = iVar3;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f10622b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (iVar4.f10613b.f5184a == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        k.f10619f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f10612a;
                        long j13 = k.f10616b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                pVar.f15053a = iVar4;
                                j11 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j11 = -2;
                    iVar2 = iVar3;
                }
                if (j11 == j10) {
                    i iVar5 = (i) pVar.f15053a;
                    pVar.f15053a = iVar2;
                    return iVar5;
                } else if (j11 > j3) {
                    j12 = Math.min(j12, j11);
                }
            }
            i13++;
            iVar3 = null;
        }
        if (j12 == Long.MAX_VALUE) {
            j12 = 0;
        }
        this.f10593e = j12;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ge.a.run():void");
    }
}

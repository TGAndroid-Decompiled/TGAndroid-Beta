package je;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f15581r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f15582a;
    public final p f15583b;
    public b f15584c;
    public long d;
    public long e;
    public int f15585f;
    public boolean h;
    private volatile int indexInArray;
    public final c f15586n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f15586n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f15582a = new m();
        this.f15583b = new Object();
        this.f15584c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f15585f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i f7;
        i f10;
        long j10;
        b bVar = this.f15584c;
        b bVar2 = b.f15587a;
        c cVar = this.f15586n;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f15582a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f15592r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f15610b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f15602b.f1303a == 1) {
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
                    int i11 = m.f15611c.get(mVar);
                    while (true) {
                        if (i10 != i11 && m.e.get(mVar) != 0) {
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
                        i iVar3 = (i) cVar.f15597f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f15592r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f15584c = b.f15587a;
        }
        if (z10) {
            if (d(cVar.f15594a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f10 = f()) != null) {
                return f10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f15610b.getAndSet(mVar, null);
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

    public final int d(int i10) {
        int i11 = this.f15585f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f15585f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int d = d(2);
        c cVar = this.f15586n;
        if (d == 0) {
            i iVar = (i) cVar.e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f15597f.d();
        }
        i iVar2 = (i) cVar.f15597f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.e.d();
    }

    public final void g(int i10) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15586n.d);
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
        b bVar2 = this.f15584c;
        if (bVar2 == b.f15587a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f15592r.addAndGet(this.f15586n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f15584c = bVar;
        }
        return z10;
    }

    public final i j(int i10) {
        boolean z10;
        long j10;
        i iVar;
        long j11;
        long j12;
        i iVar2;
        int i11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f15592r;
        c cVar = this.f15586n;
        int i12 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i12 < 2) {
            return null;
        }
        int d = d(i12);
        int i13 = 0;
        long j13 = Long.MAX_VALUE;
        while (i13 < i12) {
            d++;
            if (d > i12) {
                d = 1;
            }
            a aVar = (a) cVar.h.b(d);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f15582a;
                if (i10 == 3) {
                    iVar = mVar.a();
                    j10 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.d.get(mVar);
                    int i15 = m.f15611c.get(mVar);
                    if (i10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j10 = 0;
                            if (!z10 || m.e.get(mVar) != 0) {
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
                            j10 = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                p pVar = this.f15583b;
                if (iVar != null) {
                    pVar.f16669a = iVar;
                    iVar2 = iVar3;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f15610b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (iVar4.f15602b.f1303a == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        k.f15607f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f15601a;
                        long j14 = k.f15605b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                pVar.f16669a = iVar4;
                                j12 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j12 = -2;
                    iVar2 = iVar3;
                }
                if (j12 == j11) {
                    i iVar5 = (i) pVar.f16669a;
                    pVar.f16669a = iVar2;
                    return iVar5;
                } else if (j12 > j10) {
                    j13 = Math.min(j13, j12);
                }
            }
            i13++;
            iVar3 = null;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = 0;
        }
        this.e = j13;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: je.a.run():void");
    }
}

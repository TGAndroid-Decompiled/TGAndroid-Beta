package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f13174r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f13175a;
    public final r f13176b;
    public b f13177c;
    public long d;
    public long f13178e;
    public int f13179f;
    public boolean h;
    private volatile int indexInArray;
    public final c f13180n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i7) {
        this.f13180n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f13175a = new m();
        this.f13176b = new Object();
        this.f13177c = b.d;
        this.nextParkedWorker = c.f13189w;
        int nanoTime = (int) System.nanoTime();
        this.f13179f = nanoTime == 0 ? 42 : nanoTime;
        g(i7);
    }

    public final i a(boolean z10) {
        i f10;
        i f11;
        long j3;
        b bVar = this.f13177c;
        b bVar2 = b.f13181a;
        c cVar = this.f13180n;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f13175a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f13187r;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f13207b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f13199b) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i7 = m.d.get(mVar);
                    int i10 = m.f13208c.get(mVar);
                    while (true) {
                        if (i7 != i10 && m.f13209e.get(mVar) != 0) {
                            i10--;
                            i b10 = mVar.b(i10, true);
                            if (b10 != null) {
                                iVar = b10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f13194f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f13187r.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f13177c = b.f13181a;
        }
        if (z10) {
            if (d(cVar.f13190a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f11 = f()) != null) {
                return f11;
            }
            mVar.getClass();
            i iVar4 = (i) m.f13207b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (f10 = f()) != null) {
                return f10;
            }
        } else {
            i f12 = f();
            if (f12 != null) {
                return f12;
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

    public final int d(int i7) {
        int i10 = this.f13179f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f13179f = i13;
        int i14 = i7 - 1;
        if ((i14 & i7) == 0) {
            return i13 & i14;
        }
        return (i13 & Integer.MAX_VALUE) % i7;
    }

    public final i f() {
        int d = d(2);
        c cVar = this.f13180n;
        if (d == 0) {
            i iVar = (i) cVar.f13193e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f13194f.d();
        }
        i iVar2 = (i) cVar.f13194f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f13193e.d();
    }

    public final void g(int i7) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13180n.d);
        sb2.append("-worker-");
        if (i7 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i7);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i7;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        boolean z10;
        b bVar2 = this.f13177c;
        if (bVar2 == b.f13181a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f13187r.addAndGet(this.f13180n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f13177c = bVar;
        }
        return z10;
    }

    public final i j(int i7) {
        boolean z10;
        long j3;
        i iVar;
        long j10;
        long j11;
        i iVar2;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f13187r;
        c cVar = this.f13180n;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int d = d(i11);
        int i12 = 0;
        long j12 = Long.MAX_VALUE;
        while (i12 < i11) {
            d++;
            if (d > i11) {
                d = 1;
            }
            a aVar = (a) cVar.h.b(d);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f13175a;
                if (i7 == 3) {
                    iVar = mVar.a();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i13 = m.d.get(mVar);
                    int i14 = m.f13208c.get(mVar);
                    if (i7 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i13 != i14) {
                            j3 = 0;
                            if (!z10 || m.f13209e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                iVar = mVar.b(i13, z10);
                                if (iVar != null) {
                                    break;
                                }
                                i13 = i15;
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
                r rVar = this.f13176b;
                if (iVar != null) {
                    rVar.f18757a = iVar;
                    iVar2 = iVar3;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f13207b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (iVar4.f13199b) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if ((i10 & i7) == 0) {
                            break;
                        }
                        k.f13205f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f13198a;
                        long j13 = k.f13202b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                rVar.f18757a = iVar4;
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
                    i iVar5 = (i) rVar.f18757a;
                    rVar.f18757a = iVar2;
                    return iVar5;
                } else if (j11 > j3) {
                    j12 = Math.min(j12, j11);
                }
            }
            i12++;
            iVar3 = null;
        }
        if (j12 == Long.MAX_VALUE) {
            j12 = 0;
        }
        this.f13178e = j12;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ge.a.run():void");
    }
}

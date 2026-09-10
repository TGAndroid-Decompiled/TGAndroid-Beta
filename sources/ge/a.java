package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f8749r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f8750a;
    public final p f8751b;
    public b f8752c;
    public long d;
    public long e;
    public int f8753f;
    public boolean h;
    private volatile int indexInArray;
    public final c f8754n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f8754n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f8750a = new m();
        this.f8751b = new Object();
        this.f8752c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f8753f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i f7;
        i f10;
        long j3;
        b bVar = this.f8752c;
        b bVar2 = b.f8755a;
        c cVar = this.f8754n;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f8750a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8760r;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8778b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f8770b.f5019a == 1) {
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
                    int i11 = m.f8779c.get(mVar);
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
                        i iVar3 = (i) cVar.f8765f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f8760r.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f8752c = b.f8755a;
        }
        if (z10) {
            if (e(cVar.f8762a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f10 = f()) != null) {
                return f10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f8778b.getAndSet(mVar, null);
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
        int i11 = this.f8753f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f8753f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int e = e(2);
        c cVar = this.f8754n;
        if (e == 0) {
            i iVar = (i) cVar.e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f8765f.d();
        }
        i iVar2 = (i) cVar.f8765f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.e.d();
    }

    public final void g(int i10) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8754n.d);
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
        b bVar2 = this.f8752c;
        if (bVar2 == b.f8755a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f8760r.addAndGet(this.f8754n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f8752c = bVar;
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8760r;
        c cVar = this.f8754n;
        int i12 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i12 < 2) {
            return null;
        }
        int e = e(i12);
        int i13 = 0;
        long j12 = Long.MAX_VALUE;
        while (i13 < i12) {
            e++;
            if (e > i12) {
                e = 1;
            }
            a aVar = (a) cVar.h.b(e);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f8750a;
                if (i10 == 3) {
                    iVar = mVar.a();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.d.get(mVar);
                    int i15 = m.f8779c.get(mVar);
                    if (i10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j3 = 0;
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
                            j3 = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                p pVar = this.f8751b;
                if (iVar != null) {
                    pVar.f12576a = iVar;
                    iVar2 = iVar3;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8778b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (iVar4.f8770b.f5019a == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        k.f8775f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f8769a;
                        long j13 = k.f8773b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                pVar.f12576a = iVar4;
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
                    i iVar5 = (i) pVar.f12576a;
                    pVar.f12576a = iVar2;
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
        this.e = j12;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ge.a.run():void");
    }
}

package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f402r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final n f403a;
    public final p f404b;
    public b f405c;
    public long d;
    public long e;
    public int f406f;
    public boolean h;
    private volatile int indexInArray;
    public final c f407n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f407n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f403a = new n();
        this.f404b = new Object();
        this.f405c = b.d;
        this.nextParkedWorker = c.f415w;
        int nanoTime = (int) System.nanoTime();
        this.f406f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i f7;
        i f10;
        long j10;
        b bVar = this.f405c;
        b bVar2 = b.f408a;
        c cVar = this.f407n;
        i iVar = null;
        boolean z11 = true;
        n nVar = this.f403a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f413r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f433b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar2 != null && iVar2.f424b.f425a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(nVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(nVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i10 = n.d.get(nVar);
                    int i11 = n.f434c.get(nVar);
                    while (true) {
                        if (i10 != i11 && n.e.get(nVar) != 0) {
                            i11--;
                            i b10 = nVar.b(i11, true);
                            if (b10 != null) {
                                iVar = b10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f419f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f413r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f405c = b.f408a;
        }
        if (z10) {
            if (d(cVar.f416a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f10 = f()) != null) {
                return f10;
            }
            nVar.getClass();
            i iVar4 = (i) n.f433b.getAndSet(nVar, null);
            if (iVar4 == null) {
                iVar4 = nVar.a();
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
        int i11 = this.f406f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f406f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int d = d(2);
        c cVar = this.f407n;
        if (d == 0) {
            i iVar = (i) cVar.e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f419f.d();
        }
        i iVar2 = (i) cVar.f419f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.e.d();
    }

    public final void g(int i10) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f407n.d);
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
        b bVar2 = this.f405c;
        if (bVar2 == b.f408a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f413r.addAndGet(this.f407n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f405c = bVar;
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f413r;
        c cVar = this.f407n;
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
                n nVar = aVar.f403a;
                if (i10 == 3) {
                    iVar = nVar.a();
                    j10 = 0;
                } else {
                    nVar.getClass();
                    int i14 = n.d.get(nVar);
                    int i15 = n.f434c.get(nVar);
                    if (i10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j10 = 0;
                            if (!z10 || n.e.get(nVar) != 0) {
                                int i16 = i14 + 1;
                                iVar = nVar.b(i14, z10);
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
                p pVar = this.f404b;
                if (iVar != null) {
                    pVar.f11445a = iVar;
                    iVar2 = iVar3;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f433b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (iVar4.f424b.f425a == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        l.f430f.getClass();
                        n nVar2 = nVar;
                        long nanoTime = System.nanoTime() - iVar4.f423a;
                        long j14 = l.f428b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar2, iVar4, null)) {
                                pVar.f11445a = iVar4;
                                j12 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar2) == iVar4);
                        nVar = nVar2;
                        iVar3 = null;
                    }
                    j12 = -2;
                    iVar2 = iVar3;
                }
                if (j12 == j11) {
                    i iVar5 = (i) pVar.f11445a;
                    pVar.f11445a = iVar2;
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
        throw new UnsupportedOperationException("Method not decompiled: ae.a.run():void");
    }
}

package de;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f8802r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f8803a;
    public final r f8804b;
    public b f8805c;
    public long d;
    public long f8806e;
    public int f8807f;
    public boolean h;
    private volatile int indexInArray;
    public final c f8808n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f8808n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f8803a = new m();
        this.f8804b = new Object();
        this.f8805c = b.d;
        this.nextParkedWorker = c.f8817w;
        int nanoTime = (int) System.nanoTime();
        this.f8807f = nanoTime == 0 ? 42 : nanoTime;
        g(i3);
    }

    public final i a(boolean z10) {
        i f10;
        i f11;
        long j10;
        b bVar = this.f8805c;
        b bVar2 = b.f8809a;
        c cVar = this.f8808n;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f8803a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8815r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8835b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f8827b) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.d.get(mVar);
                    int i10 = m.f8836c.get(mVar);
                    while (true) {
                        if (i3 != i10 && m.f8837e.get(mVar) != 0) {
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
                        i iVar3 = (i) cVar.f8822f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f8815r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f8805c = b.f8809a;
        }
        if (z10) {
            if (e(cVar.f8818a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f11 = f()) != null) {
                return f11;
            }
            mVar.getClass();
            i iVar4 = (i) m.f8835b.getAndSet(mVar, null);
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

    public final int e(int i3) {
        int i10 = this.f8807f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f8807f = i13;
        int i14 = i3 - 1;
        if ((i14 & i3) == 0) {
            return i13 & i14;
        }
        return (i13 & Integer.MAX_VALUE) % i3;
    }

    public final i f() {
        int e10 = e(2);
        c cVar = this.f8808n;
        if (e10 == 0) {
            i iVar = (i) cVar.f8821e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f8822f.d();
        }
        i iVar2 = (i) cVar.f8822f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f8821e.d();
    }

    public final void g(int i3) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8808n.d);
        sb2.append("-worker-");
        if (i3 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i3);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i3;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        boolean z10;
        b bVar2 = this.f8805c;
        if (bVar2 == b.f8809a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f8815r.addAndGet(this.f8808n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f8805c = bVar;
        }
        return z10;
    }

    public final i j(int i3) {
        boolean z10;
        long j10;
        i iVar;
        long j11;
        long j12;
        i iVar2;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8815r;
        c cVar = this.f8808n;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int e10 = e(i11);
        int i12 = 0;
        long j13 = Long.MAX_VALUE;
        while (i12 < i11) {
            e10++;
            if (e10 > i11) {
                e10 = 1;
            }
            a aVar = (a) cVar.h.b(e10);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f8803a;
                if (i3 == 3) {
                    iVar = mVar.a();
                    j10 = 0;
                } else {
                    mVar.getClass();
                    int i13 = m.d.get(mVar);
                    int i14 = m.f8836c.get(mVar);
                    if (i3 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i13 != i14) {
                            j10 = 0;
                            if (!z10 || m.f8837e.get(mVar) != 0) {
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
                            j10 = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                r rVar = this.f8804b;
                if (iVar != null) {
                    rVar.f17361a = iVar;
                    iVar2 = iVar3;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8835b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (iVar4.f8827b) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if ((i10 & i3) == 0) {
                            break;
                        }
                        k.f8833f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f8826a;
                        long j14 = k.f8830b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                rVar.f17361a = iVar4;
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
                    i iVar5 = (i) rVar.f17361a;
                    rVar.f17361a = iVar2;
                    return iVar5;
                } else if (j12 > j10) {
                    j13 = Math.min(j13, j12);
                }
            }
            i12++;
            iVar3 = null;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = 0;
        }
        this.f8806e = j13;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: de.a.run():void");
    }
}

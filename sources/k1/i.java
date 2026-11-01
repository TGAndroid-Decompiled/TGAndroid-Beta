package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.j2;
import td.z1;
public final class i extends kotlin.jvm.internal.j implements ld.l {
    public final int f10535b;
    public final Object f10536c;
    public final Object d;

    public i(int i10, Object obj, Object obj2) {
        super(1);
        this.f10535b = i10;
        this.f10536c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        vd.f eVar;
        j2 j2Var;
        ad.j jVar;
        Throwable th2;
        ea.a aVar;
        switch (this.f10535b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((ce.g) this.f10536c).invoke(th3);
                vd.b bVar = (vd.b) ((ji.f) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = vd.b.f50783b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vd.b.f50787i;
                ea.a aVar2 = vd.d.f50805r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, aVar2, th3)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != aVar2) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    int i11 = (int) (j11 >> 60);
                    if (i11 != 0) {
                        if (i11 == 1) {
                            j10 = j11 & 1152921504606846975L;
                            i10 = 3;
                        }
                    } else {
                        j10 = j11 & 1152921504606846975L;
                        i10 = 2;
                    }
                    vd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vd.b.f50788j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            aVar = vd.d.f50803p;
                        } else {
                            aVar = vd.d.f50804q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((ld.l) obj2).invoke((Throwable) vd.b.f50787i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = vd.b.f50784c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = vd.b.f50783b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new vd.e((Throwable) vd.b.f50787i.get(bVar));
                    } else {
                        int i12 = (j12 > (j13 & 1152921504606846975L) ? 1 : (j12 == (j13 & 1152921504606846975L) ? 0 : -1));
                        vd.f fVar = vd.g.f50807a;
                        if (i12 < 0) {
                            ea.a aVar3 = vd.d.f50798k;
                            vd.h hVar = (vd.h) vd.b.f50786g.get(bVar);
                            while (true) {
                                if (bVar.i(vd.b.f50783b.get(bVar), z10)) {
                                    eVar = new vd.e((Throwable) vd.b.f50787i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = vd.d.f50792b;
                                    long j15 = andIncrement / j14;
                                    int i13 = (int) (andIncrement % j14);
                                    if (hVar.f54440c != j15) {
                                        vd.h e = bVar.e(j15, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i13, andIncrement, aVar3);
                                    if (o10 == vd.d.f50800m) {
                                        if (aVar3 instanceof j2) {
                                            j2Var = (j2) aVar3;
                                        } else {
                                            j2Var = null;
                                        }
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i13);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == vd.d.f50802o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o10 != vd.d.f50801n) {
                                        hVar.b();
                                        eVar = o10;
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                            }
                        }
                        eVar = fVar;
                    }
                    if (eVar instanceof vd.f) {
                        eVar = null;
                    }
                    ad.j jVar2 = ad.j.f401a;
                    if (eVar == null) {
                        jVar = null;
                    } else {
                        l lVar = (l) eVar;
                        if (lVar instanceof k) {
                            td.t tVar = ((k) lVar).f10539b;
                            if (th3 == null) {
                                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th2 = th3;
                            }
                            tVar.L(th2);
                        }
                        jVar = jVar2;
                    }
                    if (jVar == null) {
                        return jVar2;
                    }
                    z10 = true;
                }
            default:
                Throwable th4 = (Throwable) obj;
                ((ud.d) this.f10536c).f50236c.removeCallbacks((z1) this.d);
                return ad.j.f401a;
        }
    }
}

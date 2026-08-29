package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.i2;
public final class i extends kotlin.jvm.internal.k implements bd.l {
    public final int f13268b;
    public final Object f13269c;
    public final Object d;

    public i(int i10, Object obj, Object obj2) {
        super(1);
        this.f13268b = i10;
        this.f13269c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        ld.f eVar;
        i2 i2Var;
        qc.i iVar;
        Throwable th2;
        fc.a aVar;
        switch (this.f13268b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((n) this.f13269c).invoke(th3);
                ld.b bVar = (ld.b) ((com.google.firebase.messaging.s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = ld.b.f15160b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ld.b.f15165i;
                fc.a aVar2 = ld.d.f15184r;
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
                    ld.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ld.b.f15166j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            aVar = ld.d.f15182p;
                        } else {
                            aVar = ld.d.f15183q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.t.a(1, obj2);
                            ((bd.l) obj2).invoke((Throwable) ld.b.f15165i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ld.b.f15161c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = ld.b.f15160b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new ld.e((Throwable) ld.b.f15165i.get(bVar));
                    } else {
                        ld.f fVar = ld.g.f15186a;
                        if (j12 < (j13 & 1152921504606846975L)) {
                            fc.a aVar3 = ld.d.f15177k;
                            ld.h hVar = (ld.h) ld.b.f15164g.get(bVar);
                            while (true) {
                                if (bVar.i(ld.b.f15160b.get(bVar), z10)) {
                                    eVar = new ld.e((Throwable) ld.b.f15165i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = ld.d.f15170b;
                                    long j15 = andIncrement / j14;
                                    int i12 = (int) (andIncrement % j14);
                                    if (hVar.f19536c != j15) {
                                        ld.h e10 = bVar.e(j15, hVar);
                                        if (e10 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e10;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, aVar3);
                                    if (o10 == ld.d.f15179m) {
                                        if (aVar3 instanceof i2) {
                                            i2Var = (i2) aVar3;
                                        } else {
                                            i2Var = null;
                                        }
                                        if (i2Var != null) {
                                            i2Var.b(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == ld.d.f15181o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o10 != ld.d.f15180n) {
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
                    if (eVar instanceof ld.f) {
                        eVar = null;
                    }
                    qc.i iVar2 = qc.i.f46603a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        l lVar = (l) eVar;
                        if (lVar instanceof k) {
                            jd.t tVar = ((k) lVar).f13272b;
                            if (th3 == null) {
                                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th2 = th3;
                            }
                            tVar.L(th2);
                        }
                        iVar = iVar2;
                    }
                    if (iVar == null) {
                        return iVar2;
                    }
                    z10 = true;
                }
            default:
                Throwable th4 = (Throwable) obj;
                ((kd.d) this.f13269c).f13626c.removeCallbacks((ab.o) this.d);
                return qc.i.f46603a;
        }
    }
}

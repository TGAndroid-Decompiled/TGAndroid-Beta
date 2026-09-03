package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.i2;
public final class j extends kotlin.jvm.internal.k implements dd.l {
    public final int f9563b;
    public final Object f9564c;
    public final Object d;

    public j(int i10, Object obj, Object obj2) {
        super(1);
        this.f9563b = i10;
        this.f9564c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z4;
        boolean z10;
        long j10;
        int i10;
        nd.f eVar;
        i2 i2Var;
        sc.i iVar;
        Throwable th2;
        o3.c cVar;
        switch (this.f9563b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((o) this.f9564c).invoke(th3);
                nd.b bVar = (nd.b) ((com.google.firebase.messaging.r) this.d).f4006c;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = nd.b.f14898b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.b.f14902i;
                o3.c cVar2 = nd.d.f14920r;
                while (true) {
                    z4 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, cVar2, th3)) {
                        z10 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != cVar2) {
                        z10 = false;
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
                    nd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z10) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nd.b.f14903j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            cVar = nd.d.f14918p;
                        } else {
                            cVar = nd.d.f14919q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, cVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.t.a(1, obj2);
                            ((dd.l) obj2).invoke((Throwable) nd.b.f14902i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = nd.b.f14899c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = nd.b.f14898b.get(bVar);
                    if (bVar.i(j13, z4)) {
                        eVar = new nd.e((Throwable) nd.b.f14902i.get(bVar));
                    } else {
                        nd.f fVar = nd.g.f14922a;
                        if (j12 < (j13 & 1152921504606846975L)) {
                            o3.c cVar3 = nd.d.f14913k;
                            nd.h hVar = (nd.h) nd.b.f14901g.get(bVar);
                            while (true) {
                                if (bVar.i(nd.b.f14898b.get(bVar), z4)) {
                                    eVar = new nd.e((Throwable) nd.b.f14902i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = nd.d.f14907b;
                                    long j15 = andIncrement / j14;
                                    int i12 = (int) (andIncrement % j14);
                                    if (hVar.f43071c != j15) {
                                        nd.h e = bVar.e(j15, hVar);
                                        if (e == null) {
                                            continue;
                                            z4 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, cVar3);
                                    if (o10 == nd.d.f14915m) {
                                        if (cVar3 instanceof i2) {
                                            i2Var = (i2) cVar3;
                                        } else {
                                            i2Var = null;
                                        }
                                        if (i2Var != null) {
                                            i2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == nd.d.f14917o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z4 = true;
                                    } else if (o10 != nd.d.f14916n) {
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
                    if (eVar instanceof nd.f) {
                        eVar = null;
                    }
                    sc.i iVar2 = sc.i.f44318a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        m mVar = (m) eVar;
                        if (mVar instanceof l) {
                            ld.t tVar = ((l) mVar).f9567b;
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
                    z4 = true;
                }
            default:
                Throwable th4 = (Throwable) obj;
                ((md.d) this.f9564c).f13906c.removeCallbacks((androidx.biometric.j) this.d);
                return sc.i.f44318a;
        }
    }
}

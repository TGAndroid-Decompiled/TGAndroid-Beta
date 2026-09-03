package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.i2;
public final class j extends kotlin.jvm.internal.k implements dd.l {
    public final int f10287b;
    public final Object f10288c;
    public final Object d;

    public j(int i10, Object obj, Object obj2) {
        super(1);
        this.f10287b = i10;
        this.f10288c = obj;
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
        com.google.android.gms.internal.clearcut.e eVar2;
        switch (this.f10287b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((o) this.f10288c).invoke(th3);
                nd.b bVar = (nd.b) ((com.google.firebase.messaging.s) this.d).f4082c;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = nd.b.f15931b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.b.f15936i;
                com.google.android.gms.internal.clearcut.e eVar3 = nd.d.f15955r;
                while (true) {
                    z4 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, eVar3, th3)) {
                        z10 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != eVar3) {
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
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nd.b.f15937j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            eVar2 = nd.d.f15953p;
                        } else {
                            eVar2 = nd.d.f15954q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, eVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.t.a(1, obj2);
                            ((dd.l) obj2).invoke((Throwable) nd.b.f15936i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = nd.b.f15932c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = nd.b.f15931b.get(bVar);
                    if (bVar.i(j13, z4)) {
                        eVar = new nd.e((Throwable) nd.b.f15936i.get(bVar));
                    } else {
                        nd.f fVar = nd.g.f15957a;
                        if (j12 < (j13 & 1152921504606846975L)) {
                            com.google.android.gms.internal.clearcut.e eVar4 = nd.d.f15948k;
                            nd.h hVar = (nd.h) nd.b.f15935g.get(bVar);
                            while (true) {
                                if (bVar.i(nd.b.f15931b.get(bVar), z4)) {
                                    eVar = new nd.e((Throwable) nd.b.f15936i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = nd.d.f15941b;
                                    long j15 = andIncrement / j14;
                                    int i12 = (int) (andIncrement % j14);
                                    if (hVar.f44851c != j15) {
                                        nd.h e6 = bVar.e(j15, hVar);
                                        if (e6 == null) {
                                            continue;
                                            z4 = true;
                                        } else {
                                            hVar = e6;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, eVar4);
                                    if (o10 == nd.d.f15950m) {
                                        if (eVar4 instanceof i2) {
                                            i2Var = (i2) eVar4;
                                        } else {
                                            i2Var = null;
                                        }
                                        if (i2Var != null) {
                                            i2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == nd.d.f15952o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z4 = true;
                                    } else if (o10 != nd.d.f15951n) {
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
                    sc.i iVar2 = sc.i.f47274a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        m mVar = (m) eVar;
                        if (mVar instanceof l) {
                            ld.t tVar = ((l) mVar).f10291b;
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
                ((md.d) this.f10288c).f13644c.removeCallbacks((androidx.biometric.k) this.d);
                return sc.i.f47274a;
        }
    }
}

package jd;

import a9.o;
import ad.l;
import com.google.firebase.messaging.t;
import id.j2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.j;
import k1.m;
import kd.g;
import kd.h;
import kotlin.jvm.internal.k;
import pc.i;

public final class d extends k implements l {

    public final int f12905b;

    public final Object f12906c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f12905b = i10;
        this.f12906c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        Object eVar;
        Object objO;
        j2 j2Var;
        i iVar;
        switch (this.f12905b) {
            case 0:
                ((e) this.f12906c).f12907c.removeCallbacks((o) this.d);
                return i.f45696a;
            default:
                Throwable th = (Throwable) obj;
                ((m) this.f12906c).invoke(th);
                kd.b bVar = (kd.b) ((t) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = kd.b.f15156b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kd.b.f15161i;
                ec.a aVar = kd.d.f15180r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, aVar, th)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != aVar) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    int i11 = (int) (j11 >> 60);
                    if (i11 == 0) {
                        j10 = j11 & 1152921504606846975L;
                        i10 = 2;
                    } else if (i11 == 1) {
                        j10 = j11 & 1152921504606846975L;
                        i10 = 3;
                    }
                    kd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (((long) i10) << 60) + j10);
                    bVar = bVar2;
                    if (!zCompareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kd.b.f15162j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        ec.a aVar2 = obj2 == null ? kd.d.f15178p : kd.d.f15179q;
                        while (true) {
                            if (atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar2)) {
                                if (obj2 != null) {
                                    kotlin.jvm.internal.t.a(1, obj2);
                                    ((l) obj2).invoke((Throwable) kd.b.f15161i.get(bVar));
                                }
                            } else if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                            }
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = kd.b.f15157c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = kd.b.f15156b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new kd.e((Throwable) kd.b.f15161i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        kd.f fVar = g.f15182a;
                        if (j12 >= j14) {
                            eVar = fVar;
                        } else {
                            Object obj3 = kd.d.f15173k;
                            h hVar = (h) kd.b.f15160g.get(bVar);
                            while (true) {
                                if (bVar.i(kd.b.f15156b.get(bVar), z10)) {
                                    eVar = new kd.e((Throwable) kd.b.f15161i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = kd.d.f15166b;
                                    long j16 = andIncrement / j15;
                                    int i12 = (int) (andIncrement % j15);
                                    if (hVar.f18506c == j16) {
                                        objO = bVar.o(hVar, i12, andIncrement, obj3);
                                        if (objO == kd.d.f15175m) {
                                            if (obj3 instanceof j2) {
                                                j2Var = (j2) obj3;
                                            } else {
                                                j2Var = null;
                                            }
                                            if (j2Var != null) {
                                                j2Var.a(hVar, i12);
                                            }
                                            bVar.q(andIncrement);
                                            hVar.i();
                                            eVar = fVar;
                                        } else if (objO == kd.d.f15177o) {
                                            if (andIncrement < bVar.g()) {
                                                hVar.b();
                                            }
                                            z10 = true;
                                        } else {
                                            if (objO != kd.d.f15176n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            hVar.b();
                                            eVar = objO;
                                        }
                                    } else {
                                        h hVarE = bVar.e(j16, hVar);
                                        if (hVarE == null) {
                                            continue;
                                        } else {
                                            hVar = hVarE;
                                            objO = bVar.o(hVar, i12, andIncrement, obj3);
                                            if (objO == kd.d.f15175m) {
                                                if (obj3 instanceof j2) {
                                                    j2Var = (j2) obj3;
                                                } else {
                                                    j2Var = null;
                                                }
                                                if (j2Var != null) {
                                                    j2Var.a(hVar, i12);
                                                }
                                                bVar.q(andIncrement);
                                                hVar.i();
                                                eVar = fVar;
                                            } else if (objO == kd.d.f15177o) {
                                                if (andIncrement < bVar.g()) {
                                                    hVar.b();
                                                }
                                            } else {
                                                if (objO != kd.d.f15176n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                hVar.b();
                                                eVar = objO;
                                            }
                                        }
                                        z10 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (eVar instanceof kd.f) {
                        eVar = null;
                    }
                    i iVar2 = i.f45696a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k1.k kVar = (k1.k) eVar;
                        if (kVar instanceof j) {
                            ((j) kVar).f14273b.L(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        }
                        iVar = iVar2;
                    }
                    if (iVar == null) {
                        return iVar2;
                    }
                    z10 = true;
                }
                break;
        }
    }
}

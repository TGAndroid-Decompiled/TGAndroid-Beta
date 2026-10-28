package de;

import ce.j2;
import ce.t;
import com.google.firebase.messaging.q;
import ee.g;
import ee.h;
import he.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.i;
import k1.k;
import k1.m;
import k9.u;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import ud.l;
public final class d extends j implements l {
    public final int f8340b;
    public final Object f8341c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f8340b = i10;
        this.f8341c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        ee.f eVar;
        j2 j2Var;
        i iVar;
        Throwable th2;
        v vVar;
        switch (this.f8340b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((e) this.f8341c).f8342c.removeCallbacks((u) this.d);
                return i.f15579a;
            default:
                Throwable th4 = (Throwable) obj;
                ((m) this.f8341c).invoke(th4);
                ee.b bVar = (ee.b) ((q) this.d).f7759c;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = ee.b.f9894b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.b.f9898i;
                v vVar2 = ee.d.f9916r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, vVar2, th4)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != vVar2) {
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
                    ee.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.b.f9899j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            vVar = ee.d.f9914p;
                        } else {
                            vVar = ee.d.f9915q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, vVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) ee.b.f9898i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ee.b.f9895c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = ee.b.f9894b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new ee.e((Throwable) ee.b.f9898i.get(bVar));
                    } else {
                        int i12 = (j12 > (j13 & 1152921504606846975L) ? 1 : (j12 == (j13 & 1152921504606846975L) ? 0 : -1));
                        ee.f fVar = g.f9918a;
                        if (i12 < 0) {
                            v vVar3 = ee.d.f9909k;
                            h hVar = (h) ee.b.f9897g.get(bVar);
                            while (true) {
                                if (bVar.i(ee.b.f9894b.get(bVar), z10)) {
                                    eVar = new ee.e((Throwable) ee.b.f9898i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = ee.d.f9903b;
                                    long j15 = andIncrement / j14;
                                    int i13 = (int) (andIncrement % j14);
                                    if (hVar.f12817c != j15) {
                                        h e = bVar.e(j15, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i13, andIncrement, vVar3);
                                    if (o10 == ee.d.f9911m) {
                                        if (vVar3 instanceof j2) {
                                            j2Var = (j2) vVar3;
                                        } else {
                                            j2Var = null;
                                        }
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i13);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == ee.d.f9913o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o10 != ee.d.f9912n) {
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
                    if (eVar instanceof ee.f) {
                        eVar = null;
                    }
                    i iVar2 = i.f15579a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            t tVar = ((k1.j) kVar).f16057b;
                            if (th4 == null) {
                                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th2 = th4;
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
        }
    }
}

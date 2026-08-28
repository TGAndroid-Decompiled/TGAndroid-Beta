package id;

import com.google.firebase.messaging.t;
import hd.j2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.g;
import jd.h;
import k1.k;
import k1.m;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import oc.i;
import zc.l;
public final class d extends j implements l {
    public final int f11103b;
    public final Object f11104c;
    public final Object d;

    public d(int i9, Object obj, Object obj2) {
        super(1);
        this.f11103b = i9;
        this.f11104c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i9;
        jd.f eVar;
        j2 j2Var;
        i iVar;
        Throwable th;
        e5.c cVar;
        switch (this.f11103b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((e) this.f11104c).f11105c.removeCallbacks((androidx.biometric.j) this.d);
                return i.f19197a;
            default:
                Throwable th3 = (Throwable) obj;
                ((m) this.f11104c).invoke(th3);
                jd.b bVar = (jd.b) ((t) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = jd.b.f14307b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jd.b.f14312i;
                e5.c cVar2 = jd.d.f14331r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, cVar2, th3)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != cVar2) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    int i10 = (int) (j11 >> 60);
                    if (i10 != 0) {
                        if (i10 == 1) {
                            j10 = j11 & 1152921504606846975L;
                            i9 = 3;
                        }
                    } else {
                        j10 = j11 & 1152921504606846975L;
                        i9 = 2;
                    }
                    jd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i9 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = jd.b.f14313j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            cVar = jd.d.f14329p;
                        } else {
                            cVar = jd.d.f14330q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, cVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) jd.b.f14312i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = jd.b.f14308c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = jd.b.f14307b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new jd.e((Throwable) jd.b.f14312i.get(bVar));
                    } else {
                        jd.f fVar = g.f14333a;
                        if (j12 < (j13 & 1152921504606846975L)) {
                            e5.c cVar3 = jd.d.f14324k;
                            h hVar = (h) jd.b.f14311g.get(bVar);
                            while (true) {
                                if (bVar.i(jd.b.f14307b.get(bVar), z10)) {
                                    eVar = new jd.e((Throwable) jd.b.f14312i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = jd.d.f14317b;
                                    long j15 = andIncrement / j14;
                                    int i11 = (int) (andIncrement % j14);
                                    if (hVar.f17670c != j15) {
                                        h e10 = bVar.e(j15, hVar);
                                        if (e10 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e10;
                                        }
                                    }
                                    Object o6 = bVar.o(hVar, i11, andIncrement, cVar3);
                                    if (o6 == jd.d.f14326m) {
                                        if (cVar3 instanceof j2) {
                                            j2Var = (j2) cVar3;
                                        } else {
                                            j2Var = null;
                                        }
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i11);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o6 == jd.d.f14328o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o6 != jd.d.f14327n) {
                                        hVar.b();
                                        eVar = o6;
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                            }
                        }
                        eVar = fVar;
                    }
                    if (eVar instanceof jd.f) {
                        eVar = null;
                    }
                    i iVar2 = i.f19197a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            hd.t tVar = ((k1.j) kVar).f14452b;
                            if (th3 == null) {
                                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th = th3;
                            }
                            tVar.L(th);
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

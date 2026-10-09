package be;

import ae.k2;
import ae.t;
import ce.h;
import hd.i;
import i9.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import je.g;
import k1.k;
import kotlin.jvm.internal.j;
import sd.l;
public final class d extends j implements l {
    public final int f3878b;
    public final Object f3879c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f3878b = i10;
        this.f3879c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        int i10;
        ce.f eVar;
        k2 k2Var;
        i iVar;
        Throwable th2;
        da.a aVar;
        switch (this.f3878b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((e) this.f3879c).f3880c.removeCallbacks((s) this.d);
                return i.f11092a;
            default:
                Throwable th4 = (Throwable) obj;
                ((g) this.f3879c).invoke(th4);
                ce.b bVar = (ce.b) ((com.google.firebase.messaging.s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = ce.b.f4607b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ce.b.f4612i;
                da.a aVar2 = ce.d.f4631r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, aVar2, th4)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != aVar2) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(bVar);
                    int i11 = (int) (j10 >> 60);
                    if (i11 != 0) {
                        if (i11 == 1) {
                            j3 = j10 & 1152921504606846975L;
                            i10 = 3;
                        }
                    } else {
                        j3 = j10 & 1152921504606846975L;
                        i10 = 2;
                    }
                    ce.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j10, (i10 << 60) + j3);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ce.b.f4613j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            aVar = ce.d.f4629p;
                        } else {
                            aVar = ce.d.f4630q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) ce.b.f4612i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ce.b.f4608c;
                    long j11 = atomicLongFieldUpdater3.get(bVar);
                    long j12 = ce.b.f4607b.get(bVar);
                    if (bVar.i(j12, z10)) {
                        eVar = new ce.e((Throwable) ce.b.f4612i.get(bVar));
                    } else {
                        int i12 = (j11 > (j12 & 1152921504606846975L) ? 1 : (j11 == (j12 & 1152921504606846975L) ? 0 : -1));
                        ce.f fVar = ce.g.f4633a;
                        if (i12 < 0) {
                            da.a aVar3 = ce.d.f4624k;
                            h hVar = (h) ce.b.f4611g.get(bVar);
                            while (true) {
                                if (bVar.i(ce.b.f4607b.get(bVar), z10)) {
                                    eVar = new ce.e((Throwable) ce.b.f4612i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j13 = ce.d.f4617b;
                                    long j14 = andIncrement / j13;
                                    int i13 = (int) (andIncrement % j13);
                                    if (hVar.f9915c != j14) {
                                        h e7 = bVar.e(j14, hVar);
                                        if (e7 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e7;
                                        }
                                    }
                                    Object o9 = bVar.o(hVar, i13, andIncrement, aVar3);
                                    if (o9 == ce.d.f4626m) {
                                        if (aVar3 instanceof k2) {
                                            k2Var = (k2) aVar3;
                                        } else {
                                            k2Var = null;
                                        }
                                        if (k2Var != null) {
                                            k2Var.b(hVar, i13);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o9 == ce.d.f4628o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o9 != ce.d.f4627n) {
                                        hVar.b();
                                        eVar = o9;
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                            }
                        }
                        eVar = fVar;
                    }
                    if (eVar instanceof ce.f) {
                        eVar = null;
                    }
                    i iVar2 = i.f11092a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            t tVar = ((k1.j) kVar).f14345b;
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

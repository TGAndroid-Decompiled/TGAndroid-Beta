package ce;

import be.j2;
import be.t;
import com.google.firebase.messaging.s;
import de.g;
import de.h;
import id.i;
import j9.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import k1.m;
import kotlin.jvm.internal.j;
import td.l;
public final class d extends j implements l {
    public final int f4744b;
    public final Object f4745c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f4744b = i10;
        this.f4745c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        de.f eVar;
        j2 j2Var;
        i iVar;
        Throwable th2;
        a6.i iVar2;
        switch (this.f4744b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((e) this.f4745c).f4746c.removeCallbacks((u) this.d);
                return i.f11390a;
            default:
                Throwable th4 = (Throwable) obj;
                ((m) this.f4745c).invoke(th4);
                de.b bVar = (de.b) ((s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = de.b.f6489b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = de.b.f6493i;
                a6.i iVar3 = de.d.f6511r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, iVar3, th4)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != iVar3) {
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
                    de.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = de.b.f6494j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            iVar2 = de.d.f6509p;
                        } else {
                            iVar2 = de.d.f6510q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, iVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) de.b.f6493i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = de.b.f6490c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = de.b.f6489b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new de.e((Throwable) de.b.f6493i.get(bVar));
                    } else {
                        int i12 = (j12 > (j13 & 1152921504606846975L) ? 1 : (j12 == (j13 & 1152921504606846975L) ? 0 : -1));
                        de.f fVar = g.f6513a;
                        if (i12 < 0) {
                            a6.i iVar4 = de.d.f6504k;
                            h hVar = (h) de.b.f6492g.get(bVar);
                            while (true) {
                                if (bVar.i(de.b.f6489b.get(bVar), z10)) {
                                    eVar = new de.e((Throwable) de.b.f6493i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = de.d.f6498b;
                                    long j15 = andIncrement / j14;
                                    int i13 = (int) (andIncrement % j14);
                                    if (hVar.f10136c != j15) {
                                        h e = bVar.e(j15, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i13, andIncrement, iVar4);
                                    if (o10 == de.d.f6506m) {
                                        if (iVar4 instanceof j2) {
                                            j2Var = (j2) iVar4;
                                        } else {
                                            j2Var = null;
                                        }
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i13);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == de.d.f6508o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o10 != de.d.f6507n) {
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
                    if (eVar instanceof de.f) {
                        eVar = null;
                    }
                    i iVar5 = i.f11390a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            t tVar = ((k1.j) kVar).f13780b;
                            if (th4 == null) {
                                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th2 = th4;
                            }
                            tVar.L(th2);
                        }
                        iVar = iVar5;
                    }
                    if (iVar == null) {
                        return iVar5;
                    }
                    z10 = true;
                }
        }
    }
}

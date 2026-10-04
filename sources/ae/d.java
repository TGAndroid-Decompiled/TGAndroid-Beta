package ae;

import be.h;
import gd.i;
import i9.s;
import ie.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import kotlin.jvm.internal.j;
import rd.l;
import zd.i2;
import zd.t;
public final class d extends j implements l {
    public final int f431b;
    public final Object f432c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f431b = i10;
        this.f432c = obj;
        this.d = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        int i10;
        be.f eVar;
        i2 i2Var;
        i iVar;
        Throwable th2;
        com.google.android.gms.internal.clearcut.e eVar2;
        switch (this.f431b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((e) this.f432c).f433c.removeCallbacks((s) this.d);
                return i.f10452a;
            default:
                Throwable th4 = (Throwable) obj;
                ((g) this.f432c).invoke(th4);
                be.b bVar = (be.b) ((com.google.firebase.messaging.s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = be.b.f3786b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.f3791i;
                com.google.android.gms.internal.clearcut.e eVar3 = be.d.f3810r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, eVar3, th4)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != eVar3) {
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
                    be.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j10, (i10 << 60) + j3);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.b.f3792j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            eVar2 = be.d.f3808p;
                        } else {
                            eVar2 = be.d.f3809q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, eVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) be.b.f3791i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = be.b.f3787c;
                    long j11 = atomicLongFieldUpdater3.get(bVar);
                    long j12 = be.b.f3786b.get(bVar);
                    if (bVar.i(j12, z10)) {
                        eVar = new be.e((Throwable) be.b.f3791i.get(bVar));
                    } else {
                        be.f fVar = be.g.f3812a;
                        if (j11 < (j12 & 1152921504606846975L)) {
                            com.google.android.gms.internal.clearcut.e eVar4 = be.d.f3803k;
                            h hVar = (h) be.b.f3790g.get(bVar);
                            while (true) {
                                if (bVar.i(be.b.f3786b.get(bVar), z10)) {
                                    eVar = new be.e((Throwable) be.b.f3791i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j13 = be.d.f3796b;
                                    long j14 = andIncrement / j13;
                                    int i12 = (int) (andIncrement % j13);
                                    if (hVar.f8892c != j14) {
                                        h e7 = bVar.e(j14, hVar);
                                        if (e7 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e7;
                                        }
                                    }
                                    Object o9 = bVar.o(hVar, i12, andIncrement, eVar4);
                                    if (o9 == be.d.f3805m) {
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
                                    } else if (o9 == be.d.f3807o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o9 != be.d.f3806n) {
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
                    if (eVar instanceof be.f) {
                        eVar = null;
                    }
                    i iVar2 = i.f10452a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            t tVar = ((k1.j) kVar).f14308b;
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

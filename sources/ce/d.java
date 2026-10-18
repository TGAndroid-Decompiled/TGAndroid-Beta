package ce;

import be.j2;
import be.t;
import com.google.firebase.messaging.r;
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
import kotlin.jvm.internal.s;
import td.l;
public final class d extends j implements l {
    public final int f5115b;
    public final Object f5116c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f5115b = i10;
        this.f5116c = obj;
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
        com.google.android.gms.internal.clearcut.e eVar2;
        switch (this.f5115b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((e) this.f5116c).f5117c.removeCallbacks((u) this.d);
                return i.f12775a;
            default:
                Throwable th4 = (Throwable) obj;
                ((m) this.f5116c).invoke(th4);
                de.b bVar = (de.b) ((r) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = de.b.f7943b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = de.b.f7947i;
                com.google.android.gms.internal.clearcut.e eVar3 = de.d.f7965r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, eVar3, th4)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != eVar3) {
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
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = de.b.f7948j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            eVar2 = de.d.f7963p;
                        } else {
                            eVar2 = de.d.f7964q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, eVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) de.b.f7947i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = de.b.f7944c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = de.b.f7943b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new de.e((Throwable) de.b.f7947i.get(bVar));
                    } else {
                        int i12 = (j12 > (j13 & 1152921504606846975L) ? 1 : (j12 == (j13 & 1152921504606846975L) ? 0 : -1));
                        de.f fVar = g.f7967a;
                        if (i12 < 0) {
                            com.google.android.gms.internal.clearcut.e eVar4 = de.d.f7958k;
                            h hVar = (h) de.b.f7946g.get(bVar);
                            while (true) {
                                if (bVar.i(de.b.f7943b.get(bVar), z10)) {
                                    eVar = new de.e((Throwable) de.b.f7947i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = de.d.f7952b;
                                    long j15 = andIncrement / j14;
                                    int i13 = (int) (andIncrement % j14);
                                    if (hVar.f11040c != j15) {
                                        h e = bVar.e(j15, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i13, andIncrement, eVar4);
                                    if (o10 == de.d.f7960m) {
                                        if (eVar4 instanceof j2) {
                                            j2Var = (j2) eVar4;
                                        } else {
                                            j2Var = null;
                                        }
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i13);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == de.d.f7962o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o10 != de.d.f7961n) {
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
                    i iVar2 = i.f12775a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            t tVar = ((k1.j) kVar).f14580b;
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

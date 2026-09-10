package ae;

import be.h;
import ee.v;
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
    public final int f396b;
    public final Object f397c;
    public final Object d;

    public d(int i10, Object obj, Object obj2) {
        super(1);
        this.f396b = i10;
        this.f397c = obj;
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
        v vVar;
        switch (this.f396b) {
            case 0:
                Throwable th3 = (Throwable) obj;
                ((e) this.f397c).f398c.removeCallbacks((s) this.d);
                return i.f8748a;
            default:
                Throwable th4 = (Throwable) obj;
                ((g) this.f397c).invoke(th4);
                be.b bVar = (be.b) ((ki.f) this.d).f12540c;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = be.b.f2203b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.f2207i;
                v vVar2 = be.d.f2225r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, vVar2, th4)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != vVar2) {
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
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.b.f2208j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        if (obj2 == null) {
                            vVar = be.d.f2223p;
                        } else {
                            vVar = be.d.f2224q;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, vVar)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) be.b.f2207i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = be.b.f2204c;
                    long j11 = atomicLongFieldUpdater3.get(bVar);
                    long j12 = be.b.f2203b.get(bVar);
                    if (bVar.i(j12, z10)) {
                        eVar = new be.e((Throwable) be.b.f2207i.get(bVar));
                    } else {
                        be.f fVar = be.g.f2227a;
                        if (j11 < (j12 & 1152921504606846975L)) {
                            v vVar3 = be.d.f2218k;
                            h hVar = (h) be.b.f2206g.get(bVar);
                            while (true) {
                                if (bVar.i(be.b.f2203b.get(bVar), z10)) {
                                    eVar = new be.e((Throwable) be.b.f2207i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j13 = be.d.f2212b;
                                    long j14 = andIncrement / j13;
                                    int i12 = (int) (andIncrement % j13);
                                    if (hVar.f7499c != j14) {
                                        h e = bVar.e(j14, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o9 = bVar.o(hVar, i12, andIncrement, vVar3);
                                    if (o9 == be.d.f2220m) {
                                        if (vVar3 instanceof i2) {
                                            i2Var = (i2) vVar3;
                                        } else {
                                            i2Var = null;
                                        }
                                        if (i2Var != null) {
                                            i2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o9 == be.d.f2222o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else if (o9 != be.d.f2221n) {
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
                    i iVar2 = i.f8748a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            t tVar = ((k1.j) kVar).f12015b;
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

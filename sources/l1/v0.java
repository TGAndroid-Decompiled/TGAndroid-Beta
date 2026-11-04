package l1;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import wd.c2;
public final class v0 extends kotlin.jvm.internal.k implements od.l {
    public final int f17652b;
    public final Serializable f17653c;
    public final Object d;

    public v0(Serializable serializable, Object obj, int i3) {
        super(1);
        this.f17652b = i3;
        this.f17653c = serializable;
        this.d = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        yd.i hVar;
        c2 c2Var;
        dd.k kVar;
        dd.k kVar2;
        Throwable th2;
        switch (this.f17652b) {
            case 0:
                boolean a10 = kotlin.jvm.internal.j.a((String) obj, ((File) this.f17653c).getName());
                dd.k kVar3 = dd.k.f8801a;
                if (a10) {
                    yd.o oVar = (yd.o) ((yd.p) this.d);
                    Object b10 = oVar.b(kVar3);
                    if (!(b10 instanceof yd.i)) {
                        dd.k kVar4 = (dd.k) b10;
                    } else {
                        Object obj2 = ((yd.j) wd.b0.u(new ae.d(oVar, (fd.c) null, 11))).f59410a;
                    }
                }
                return kVar3;
            default:
                Throwable th3 = (Throwable) obj;
                ((y) this.f17653c).invoke(th3);
                yd.c cVar = (yd.c) ((ui.f) this.d).d;
                cVar.g(th3, false);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = yd.c.f59381c;
                    long j10 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = yd.c.f59380b;
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j11, true)) {
                        hVar = new yd.h(cVar.m());
                    } else {
                        int i3 = (j10 > (j11 & 1152921504606846975L) ? 1 : (j10 == (j11 & 1152921504606846975L) ? 0 : -1));
                        yd.i iVar = yd.j.f59409b;
                        if (i3 < 0) {
                            be.t tVar = yd.e.f59397k;
                            yd.k kVar5 = (yd.k) yd.c.h.get(cVar);
                            while (true) {
                                if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                                    hVar = new yd.h(cVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j12 = yd.e.f59390b;
                                    long j13 = andIncrement / j12;
                                    int i10 = (int) (andIncrement % j12);
                                    if (kVar5.f3282c != j13) {
                                        yd.k l10 = cVar.l(j13, kVar5);
                                        if (l10 == null) {
                                            continue;
                                        } else {
                                            kVar5 = l10;
                                        }
                                    }
                                    Object z10 = cVar.z(kVar5, i10, andIncrement, tVar);
                                    if (z10 == yd.e.f59399m) {
                                        if (tVar instanceof c2) {
                                            c2Var = (c2) tVar;
                                        } else {
                                            c2Var = null;
                                        }
                                        if (c2Var != null) {
                                            c2Var.a(kVar5, i10);
                                        }
                                        cVar.B(andIncrement);
                                        kVar5.i();
                                    } else if (z10 == yd.e.f59401o) {
                                        if (andIncrement < cVar.p()) {
                                            kVar5.b();
                                        }
                                    } else if (z10 != yd.e.f59400n) {
                                        kVar5.b();
                                        hVar = z10;
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                            }
                        }
                        hVar = iVar;
                    }
                    kVar = null;
                    if (hVar instanceof yd.i) {
                        hVar = null;
                    }
                    kVar2 = dd.k.f8801a;
                    if (hVar != null) {
                        wd.t tVar2 = ((n0) hVar).f17590b;
                        if (th3 == null) {
                            th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                        } else {
                            th2 = th3;
                        }
                        tVar2.Q(th2);
                        kVar = kVar2;
                        continue;
                    }
                } while (kVar != null);
                return kVar2;
        }
    }
}

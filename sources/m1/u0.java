package m1;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.c2;
public final class u0 extends kotlin.jvm.internal.k implements rd.l {
    public final int f19489b;
    public final Serializable f19490c;
    public final Object d;

    public u0(int i7, Serializable serializable, Object obj) {
        super(1);
        this.f19489b = i7;
        this.f19490c = serializable;
        this.d = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        be.i hVar;
        c2 c2Var;
        gd.k kVar;
        gd.k kVar2;
        Throwable th2;
        switch (this.f19489b) {
            case 0:
                boolean a10 = kotlin.jvm.internal.j.a((String) obj, ((File) this.f19490c).getName());
                gd.k kVar3 = gd.k.f13831a;
                if (a10) {
                    be.r rVar = (be.r) ((be.s) this.d);
                    Object b10 = rVar.b(kVar3);
                    if (!(b10 instanceof be.i)) {
                        gd.k kVar4 = (gd.k) b10;
                    } else {
                        Object obj2 = ((be.j) zd.b0.u(new be.l(rVar, (id.c) null, 0))).f3219a;
                    }
                }
                return kVar3;
            default:
                Throwable th3 = (Throwable) obj;
                ((y) this.f19490c).invoke(th3);
                be.c cVar = (be.c) ((ab.b0) this.d).d;
                cVar.g(th3, false);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = be.c.f3189c;
                    long j3 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = be.c.f3188b;
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j10, true)) {
                        hVar = new be.h(cVar.m());
                    } else {
                        int i7 = (j3 > (j10 & 1152921504606846975L) ? 1 : (j3 == (j10 & 1152921504606846975L) ? 0 : -1));
                        be.i iVar = be.j.f3218b;
                        if (i7 < 0) {
                            com.google.android.gms.internal.clearcut.e eVar = be.e.f3205k;
                            be.k kVar5 = (be.k) be.c.h.get(cVar);
                            while (true) {
                                if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                                    hVar = new be.h(cVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j11 = be.e.f3198b;
                                    long j12 = andIncrement / j11;
                                    int i10 = (int) (andIncrement % j11);
                                    if (kVar5.f10799c != j12) {
                                        be.k l10 = cVar.l(j12, kVar5);
                                        if (l10 == null) {
                                            continue;
                                        } else {
                                            kVar5 = l10;
                                        }
                                    }
                                    Object z9 = cVar.z(kVar5, i10, andIncrement, eVar);
                                    if (z9 == be.e.f3207m) {
                                        if (eVar instanceof c2) {
                                            c2Var = (c2) eVar;
                                        } else {
                                            c2Var = null;
                                        }
                                        if (c2Var != null) {
                                            c2Var.a(kVar5, i10);
                                        }
                                        cVar.B(andIncrement);
                                        kVar5.i();
                                    } else if (z9 == be.e.f3209o) {
                                        if (andIncrement < cVar.p()) {
                                            kVar5.b();
                                        }
                                    } else if (z9 != be.e.f3208n) {
                                        kVar5.b();
                                        hVar = z9;
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                            }
                        }
                        hVar = iVar;
                    }
                    kVar = null;
                    if (hVar instanceof be.i) {
                        hVar = null;
                    }
                    kVar2 = gd.k.f13831a;
                    if (hVar != null) {
                        zd.t tVar = ((n0) hVar).f19435b;
                        if (th3 == null) {
                            th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                        } else {
                            th2 = th3;
                        }
                        tVar.Q(th2);
                        kVar = kVar2;
                        continue;
                    }
                } while (kVar != null);
                return kVar2;
        }
    }
}

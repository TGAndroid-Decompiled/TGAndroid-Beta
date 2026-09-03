package ld;

import k7.g7;
import k7.h8;
import k7.q7;
public abstract class a extends u1 implements uc.c, c0 {
    public final uc.h f12279c;

    public a(uc.h hVar, boolean z4) {
        super(z4);
        x((f1) hVar.get(b0.f12283b));
        this.f12279c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f12367b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, dd.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            uc.h hVar = this.f12279c;
                            Object k10 = qd.a.k(hVar, null);
                            if (!(pVar instanceof wc.a)) {
                                kotlin.jvm.internal.j.e(pVar, "<this>");
                                uc.h hVar2 = this.f12279c;
                                if (hVar2 == uc.i.f48516a) {
                                    cVar = new wc.g(this);
                                } else {
                                    cVar = new wc.c(this, hVar2);
                                }
                                kotlin.jvm.internal.t.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.t.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            qd.a.f(hVar, k10);
                            if (invoke != vc.a.f48998a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(q7.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.j.e(pVar, "<this>");
                h8.b(h8.a(pVar, aVar, this)).resumeWith(sc.i.f47274a);
                return;
            }
            return;
        }
        g7.a(pVar, aVar, this);
    }

    @Override
    public final uc.h c() {
        return this.f12279c;
    }

    @Override
    public final uc.h getContext() {
        return this.f12279c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = sc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.f12299e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(a7.b bVar) {
        e0.m(bVar, this.f12279c);
    }
}

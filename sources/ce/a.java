package ce;

import a8.jd;
import a8.pe;
import a8.wc;
public abstract class a extends v1 implements ld.c, c0 {
    public final ld.h f6200c;

    public a(ld.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.f6205b));
        this.f6200c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f6270b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, ud.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            ld.h hVar = this.f6200c;
                            Object k10 = he.a.k(hVar, null);
                            if (!(pVar instanceof nd.a)) {
                                kotlin.jvm.internal.i.e(pVar, "<this>");
                                ld.h hVar2 = this.f6200c;
                                if (hVar2 == ld.i.f16988a) {
                                    cVar = new nd.g(this);
                                } else {
                                    cVar = new nd.c(this, hVar2);
                                }
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            he.a.f(hVar, k10);
                            if (invoke != md.a.f18412a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(jd.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.i.e(pVar, "<this>");
                pe.b(pe.a(aVar, this, pVar)).resumeWith(jd.i.f15580a);
                return;
            }
            return;
        }
        wc.a(pVar, aVar, this);
    }

    @Override
    public final ld.h c() {
        return this.f6200c;
    }

    @Override
    public final ld.h getContext() {
        return this.f6200c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = jd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == f0.e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(androidx.car.app.j jVar) {
        f0.m(jVar, this.f6200c);
    }
}

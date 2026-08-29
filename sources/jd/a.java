package jd;

import i7.c7;
import i7.r6;
import i7.v7;
public abstract class a extends u1 implements sc.c, c0 {
    public final sc.h f11443c;

    public a(sc.h hVar, boolean z10) {
        super(z10);
        x((f1) hVar.get(b0.f11447b));
        this.f11443c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f11531b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, bd.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            sc.h hVar = this.f11443c;
                            Object k9 = od.a.k(hVar, null);
                            if (!(pVar instanceof uc.a)) {
                                kotlin.jvm.internal.j.e(pVar, "<this>");
                                sc.h hVar2 = this.f11443c;
                                if (hVar2 == sc.i.f47711a) {
                                    cVar = new uc.g(this);
                                } else {
                                    cVar = new uc.c(this, hVar2);
                                }
                                kotlin.jvm.internal.t.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.t.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            od.a.f(hVar, k9);
                            if (invoke != tc.a.f48210a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(c7.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.j.e(pVar, "<this>");
                v7.b(v7.a(pVar, aVar, this)).resumeWith(qc.i.f46603a);
                return;
            }
            return;
        }
        r6.a(pVar, aVar, this);
    }

    @Override
    public final sc.h c() {
        return this.f11443c;
    }

    @Override
    public final sc.h getContext() {
        return this.f11443c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = qc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.f11463e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(a6.b bVar) {
        e0.m(bVar, this.f11443c);
    }
}

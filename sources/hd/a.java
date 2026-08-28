package hd;

import g7.g7;
import g7.y5;
public abstract class a extends v1 implements qc.c, c0 {
    public final qc.h f10408c;

    public a(qc.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.f10413b));
        this.f10408c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f10494b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, zc.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            qc.h hVar = this.f10408c;
                            Object k10 = md.a.k(hVar, null);
                            if (!(pVar instanceof sc.a)) {
                                kotlin.jvm.internal.i.e(pVar, "<this>");
                                qc.h hVar2 = this.f10408c;
                                if (hVar2 == qc.i.f46140a) {
                                    cVar = new sc.g(this);
                                } else {
                                    cVar = new sc.c(this, hVar2);
                                }
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            md.a.f(hVar, k10);
                            if (invoke != rc.a.f47127a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            resumeWith(y5.a(th));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.i.e(pVar, "<this>");
                g7.b(g7.a(aVar, this, pVar)).resumeWith(oc.i.f19197a);
                return;
            }
            return;
        }
        g7.f0.a(pVar, aVar, this);
    }

    @Override
    public final qc.h c() {
        return this.f10408c;
    }

    @Override
    public final qc.h getContext() {
        return this.f10408c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = oc.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == f0.f10433e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(androidx.car.app.j jVar) {
        f0.m(jVar, this.f10408c);
    }
}

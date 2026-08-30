package ld;

import k7.f7;
import k7.g8;
import k7.p7;
public abstract class a extends u1 implements uc.c, c0 {
    public final uc.h f11857c;

    public a(uc.h hVar, boolean z4) {
        super(z4);
        x((f1) hVar.get(b0.f11861b));
        this.f11857c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f11929b.get((v) obj);
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
                            uc.h hVar = this.f11857c;
                            Object k10 = qd.a.k(hVar, null);
                            if (!(pVar instanceof wc.a)) {
                                kotlin.jvm.internal.j.e(pVar, "<this>");
                                uc.h hVar2 = this.f11857c;
                                if (hVar2 == uc.i.f45219a) {
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
                            if (invoke != vc.a.f45663a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(p7.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.j.e(pVar, "<this>");
                g8.b(g8.a(pVar, aVar, this)).resumeWith(sc.i.f44253a);
                return;
            }
            return;
        }
        f7.a(pVar, aVar, this);
    }

    @Override
    public final uc.h c() {
        return this.f11857c;
    }

    @Override
    public final uc.h getContext() {
        return this.f11857c;
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
        if (B == e0.e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(a7.b bVar) {
        e0.m(bVar, this.f11857c);
    }
}

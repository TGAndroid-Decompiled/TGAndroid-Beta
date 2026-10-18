package be;

import v7.i8;
import v7.t7;
public abstract class a extends v1 implements kd.c, c0 {
    public final kd.h f4261c;

    public a(kd.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.f4266b));
        this.f4261c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f4331b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, td.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            kd.h hVar = this.f4261c;
                            Object k10 = ge.a.k(hVar, null);
                            if (!(pVar instanceof md.a)) {
                                kotlin.jvm.internal.i.e(pVar, "<this>");
                                kd.h hVar2 = this.f4261c;
                                if (hVar2 == kd.i.f15028a) {
                                    cVar = new md.g(this);
                                } else {
                                    cVar = new md.c(this, hVar2);
                                }
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            ge.a.f(hVar, k10);
                            if (invoke != ld.a.f15998a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(i8.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w7.n.b(w7.n.a(aVar, this, pVar)).resumeWith(id.i.f12775a);
                return;
            }
            return;
        }
        t7.a(pVar, aVar, this);
    }

    @Override
    public final kd.h c() {
        return this.f4261c;
    }

    @Override
    public final kd.h getContext() {
        return this.f4261c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = id.f.a(obj);
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
        f0.m(jVar, this.f4261c);
    }
}

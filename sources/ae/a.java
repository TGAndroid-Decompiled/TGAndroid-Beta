package ae;

import v7.a8;
import v7.p7;
public abstract class a extends w1 implements jd.c, d0 {
    public final jd.h f422c;

    public a(jd.h hVar, boolean z10) {
        super(z10);
        x((h1) hVar.get(c0.f433b));
        this.f422c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f508b.get((v) obj);
        }
    }

    public final void L(e0 e0Var, a aVar, sd.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = e0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            jd.h hVar = this.f422c;
                            Object k10 = fe.a.k(hVar, null);
                            if (!(pVar instanceof ld.a)) {
                                kotlin.jvm.internal.i.e(pVar, "<this>");
                                jd.h hVar2 = this.f422c;
                                if (hVar2 == jd.i.f14128a) {
                                    cVar = new ld.h(this);
                                } else {
                                    cVar = new ld.c(this, hVar2);
                                }
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            fe.a.f(hVar, k10);
                            if (invoke != kd.a.f14783a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(a8.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w7.h.b(w7.h.a(aVar, this, pVar)).resumeWith(hd.i.f11091a);
                return;
            }
            return;
        }
        p7.a(pVar, aVar, this);
    }

    @Override
    public final jd.h c() {
        return this.f422c;
    }

    @Override
    public final jd.h getContext() {
        return this.f422c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = hd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == g0.f453e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(x xVar) {
        g0.m(xVar, this.f422c);
    }
}

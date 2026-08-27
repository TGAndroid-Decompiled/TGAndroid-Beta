package id;

import h7.h7;
import h7.k6;
import java.lang.reflect.InvocationTargetException;

public abstract class a extends v1 implements rc.c, c0 {

    public final rc.h f11117c;

    public a(rc.h hVar, boolean z10) {
        super(z10);
        x((g1) hVar.get(b0.f11122b));
        this.f11117c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f11203b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, ad.p pVar) {
        Object objInvoke;
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal == 0) {
            h7.h0.a(pVar, aVar, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                h7.b(h7.a(pVar, aVar, this)).resumeWith(pc.i.f45696a);
                return;
            }
            if (iOrdinal != 3) {
                throw new a7.c();
            }
            try {
                rc.h hVar = this.f11117c;
                Object objK = nd.a.k(hVar, null);
                try {
                    if (pVar instanceof tc.a) {
                        kotlin.jvm.internal.t.a(2, pVar);
                        objInvoke = pVar.invoke(aVar, this);
                    } else {
                        kotlin.jvm.internal.j.e(pVar, "<this>");
                        rc.h hVar2 = this.f11117c;
                        Object dVar = hVar2 == rc.i.f46899a ? new sc.d(this) : new sc.e(this, hVar2);
                        kotlin.jvm.internal.t.a(2, pVar);
                        objInvoke = pVar.invoke(aVar, dVar);
                    }
                    nd.a.f(hVar, objK);
                    if (objInvoke != sc.a.f47847a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    nd.a.f(hVar, objK);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(k6.a(th2));
            }
        }
    }

    @Override
    public final rc.h c() {
        return this.f11117c;
    }

    @Override
    public final rc.h getContext() {
        return this.f11117c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = pc.f.a(obj);
        if (thA != null) {
            obj = new v(thA, false);
        }
        Object objB = B(obj);
        if (objB == f0.f11142e) {
            return;
        }
        g(objB);
    }

    @Override
    public final void w(a7.c cVar) throws IllegalAccessException, InvocationTargetException {
        f0.m(cVar, this.f11117c);
    }
}

package db;

import b8.ad;
import java.util.Map;
public final class h0 implements le.e {
    public static final h0 f8668a;
    private static final je.d descriptor;

    static {
        ?? obj = new Object();
        f8668a = obj;
        le.m mVar = new le.m("com.google.firebase.sessions.SessionData", obj, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        dd.c[] cVarArr = j0.d;
        n0 n0Var = null;
        boolean z10 = true;
        int i3 = 0;
        h1 h1Var = null;
        Map map = null;
        while (z10) {
            int d = c2.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d == 2) {
                            map = (Map) c2.j(dVar, 2, (he.a) cVarArr[2].getValue(), map);
                            i3 |= 4;
                        } else {
                            throw new he.d(d);
                        }
                    } else {
                        h1Var = (h1) c2.j(dVar, 1, f1.f8657a, h1Var);
                        i3 |= 2;
                    }
                } else {
                    n0Var = (n0) c2.k(dVar, 0, l0.f8700a, n0Var);
                    i3 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c2.p(dVar);
        return new j0(i3, n0Var, h1Var, map);
    }

    @Override
    public final he.a[] b() {
        return new he.a[]{l0.f8700a, ad.a(f1.f8657a), ad.a((he.a) j0.d[2].getValue())};
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        j0 value = (j0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        dd.c[] cVarArr = j0.d;
        l0 l0Var = l0.f8700a;
        n0 n0Var = value.f8691a;
        Map map = value.f8693c;
        h1 h1Var = value.f8692b;
        a10.h(dVar, 0, l0Var, n0Var);
        if (a10.p(dVar) || h1Var != null) {
            a10.g(dVar, 1, f1.f8657a, h1Var);
        }
        if (a10.p(dVar) || map != null) {
            a10.g(dVar, 2, (he.a) cVarArr[2].getValue(), map);
        }
        a10.l(dVar);
    }

    @Override
    public final je.d d() {
        return descriptor;
    }
}

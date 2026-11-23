package gb;

import c8.i9;
import java.util.Map;
public final class h0 implements oe.e {
    public static final h0 f13347a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f13347a = obj;
        oe.m mVar = new oe.m("com.google.firebase.sessions.SessionData", obj, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        j0 value = (j0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        gd.c[] cVarArr = j0.d;
        l0 l0Var = l0.f13376a;
        n0 n0Var = value.f13368a;
        Map map = value.f13370c;
        g1 g1Var = value.f13369b;
        a10.h(dVar, 0, l0Var, n0Var);
        if (a10.p(dVar) || g1Var != null) {
            a10.g(dVar, 1, e1.f13329a, g1Var);
        }
        if (a10.p(dVar) || map != null) {
            a10.g(dVar, 2, (ke.a) cVarArr[2].getValue(), map);
        }
        a10.l(dVar);
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        gd.c[] cVarArr = j0.d;
        n0 n0Var = null;
        boolean z10 = true;
        int i7 = 0;
        g1 g1Var = null;
        Map map = null;
        while (z10) {
            int d = c10.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d == 2) {
                            map = (Map) c10.j(dVar, 2, (ke.a) cVarArr[2].getValue(), map);
                            i7 |= 4;
                        } else {
                            throw new ke.d(d);
                        }
                    } else {
                        g1Var = (g1) c10.j(dVar, 1, e1.f13329a, g1Var);
                        i7 |= 2;
                    }
                } else {
                    n0Var = (n0) c10.k(dVar, 0, l0.f13376a, n0Var);
                    i7 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.p(dVar);
        return new j0(i7, n0Var, g1Var, map);
    }

    @Override
    public final ke.a[] c() {
        return new ke.a[]{l0.f13376a, i9.a(e1.f13329a), i9.a((ke.a) j0.d[2].getValue())};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}

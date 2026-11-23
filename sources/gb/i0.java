package gb;

import c8.i9;
import java.util.Map;
public final class i0 implements oe.e {
    public static final i0 f13363a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f13363a = obj;
        oe.m mVar = new oe.m("com.google.firebase.sessions.SessionData", obj, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        k0 value = (k0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        gd.c[] cVarArr = k0.d;
        m0 m0Var = m0.f13381a;
        o0 o0Var = value.f13373a;
        Map map = value.f13375c;
        h1 h1Var = value.f13374b;
        a10.h(dVar, 0, m0Var, o0Var);
        if (a10.p(dVar) || h1Var != null) {
            a10.g(dVar, 1, f1.f13335a, h1Var);
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
        gd.c[] cVarArr = k0.d;
        o0 o0Var = null;
        boolean z10 = true;
        int i7 = 0;
        h1 h1Var = null;
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
                        h1Var = (h1) c10.j(dVar, 1, f1.f13335a, h1Var);
                        i7 |= 2;
                    }
                } else {
                    o0Var = (o0) c10.k(dVar, 0, m0.f13381a, o0Var);
                    i7 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.p(dVar);
        return new k0(i7, o0Var, h1Var, map);
    }

    @Override
    public final ke.a[] c() {
        return new ke.a[]{m0.f13381a, i9.a(f1.f13335a), i9.a((ke.a) k0.d[2].getValue())};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}

package gb;

import java.util.Map;
public final class i0 implements oe.e {
    public static final i0 f13712a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f13712a = obj;
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
        m0 m0Var = m0.f13732a;
        o0 o0Var = value.f13724a;
        Map map = value.f13726c;
        i1 i1Var = value.f13725b;
        a10.h(dVar, 0, m0Var, o0Var);
        if (a10.p(dVar) || i1Var != null) {
            a10.g(dVar, 1, g1.f13690a, i1Var);
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
        boolean z9 = true;
        int i7 = 0;
        i1 i1Var = null;
        Map map = null;
        while (z9) {
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
                        i1Var = (i1) c10.j(dVar, 1, g1.f13690a, i1Var);
                        i7 |= 2;
                    }
                } else {
                    o0Var = (o0) c10.k(dVar, 0, m0.f13732a, o0Var);
                    i7 |= 1;
                }
            } else {
                z9 = false;
            }
        }
        c10.p(dVar);
        return new k0(i7, o0Var, i1Var, map);
    }

    @Override
    public final ke.a[] c() {
        return new ke.a[]{m0.f13732a, c8.k1.a(g1.f13690a), c8.k1.a((ke.a) k0.d[2].getValue())};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}

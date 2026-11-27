package defpackage;

import java.util.Map;
public final class m9a implements ku4 {
    public static final m9a a;
    private static final o8a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        ug8 ug8Var = new ug8("com.google.firebase.sessions.SessionData", obj, 3);
        ug8Var.j("sessionDetails", false);
        ug8Var.j("backgroundTime", true);
        ug8Var.j("processDataMap", true);
        descriptor = ug8Var;
    }

    @Override
    public final hx5[] a() {
        return new hx5[]{q9a.a, lud.a(mrb.a), lud.a((hx5) o9a.d[2].getValue())};
    }

    @Override
    public final void b(d30 d30Var, Object obj) {
        o9a o9aVar = (o9a) obj;
        o9aVar.getClass();
        o8a o8aVar = descriptor;
        d30 a2 = d30Var.a(o8aVar);
        h26[] h26VarArr = o9a.d;
        q9a q9aVar = q9a.a;
        s9a s9aVar = o9aVar.a;
        Map map = o9aVar.c;
        orb orbVar = o9aVar.b;
        a2.i(o8aVar, 0, q9aVar, s9aVar);
        if (a2.p(o8aVar) || orbVar != null) {
            a2.h(o8aVar, 1, mrb.a, orbVar);
        }
        if (a2.p(o8aVar) || map != null) {
            a2.h(o8aVar, 2, (hx5) h26VarArr[2].getValue(), map);
        }
        a2.l(o8aVar);
    }

    @Override
    public final Object c(ykf ykfVar) {
        o8a o8aVar = descriptor;
        ykf a2 = ykfVar.a(o8aVar);
        h26[] h26VarArr = o9a.d;
        s9a s9aVar = null;
        boolean z = true;
        int i = 0;
        orb orbVar = null;
        Map map = null;
        while (z) {
            int b = a2.b(o8aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2) {
                            map = (Map) a2.j(o8aVar, 2, (hx5) h26VarArr[2].getValue(), map);
                            i |= 4;
                        } else {
                            throw new yw5(b);
                        }
                    } else {
                        orbVar = (orb) a2.j(o8aVar, 1, mrb.a, orbVar);
                        i |= 2;
                    }
                } else {
                    s9aVar = (s9a) a2.k(o8aVar, 0, q9a.a, s9aVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(o8aVar);
        return new o9a(i, s9aVar, orbVar, map);
    }

    @Override
    public final o8a d() {
        return descriptor;
    }
}

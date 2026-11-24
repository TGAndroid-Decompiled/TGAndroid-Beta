package defpackage;

import java.util.Map;
public final class w7a implements hu4 {
    public static final w7a a;
    private static final y6a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        if8 if8Var = new if8("com.google.firebase.sessions.SessionData", obj, 3);
        if8Var.j("sessionDetails", false);
        if8Var.j("backgroundTime", true);
        if8Var.j("processDataMap", true);
        descriptor = if8Var;
    }

    @Override
    public final cx5[] a() {
        return new cx5[]{a8a.a, yrd.a(npb.a), yrd.a((cx5) y7a.d[2].getValue())};
    }

    @Override
    public final void b(c40 c40Var, Object obj) {
        y7a y7aVar = (y7a) obj;
        y7aVar.getClass();
        y6a y6aVar = descriptor;
        c40 a2 = c40Var.a(y6aVar);
        d26[] d26VarArr = y7a.d;
        a8a a8aVar = a8a.a;
        c8a c8aVar = y7aVar.a;
        Map map = y7aVar.c;
        ppb ppbVar = y7aVar.b;
        a2.i(y6aVar, 0, a8aVar, c8aVar);
        if (a2.p(y6aVar) || ppbVar != null) {
            a2.h(y6aVar, 1, npb.a, ppbVar);
        }
        if (a2.p(y6aVar) || map != null) {
            a2.h(y6aVar, 2, (cx5) d26VarArr[2].getValue(), map);
        }
        a2.l(y6aVar);
    }

    @Override
    public final Object c(jif jifVar) {
        y6a y6aVar = descriptor;
        jif a2 = jifVar.a(y6aVar);
        d26[] d26VarArr = y7a.d;
        c8a c8aVar = null;
        boolean z = true;
        int i = 0;
        ppb ppbVar = null;
        Map map = null;
        while (z) {
            int b = a2.b(y6aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2) {
                            map = (Map) a2.j(y6aVar, 2, (cx5) d26VarArr[2].getValue(), map);
                            i |= 4;
                        } else {
                            throw new tw5(b);
                        }
                    } else {
                        ppbVar = (ppb) a2.j(y6aVar, 1, npb.a, ppbVar);
                        i |= 2;
                    }
                } else {
                    c8aVar = (c8a) a2.k(y6aVar, 0, a8a.a, c8aVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(y6aVar);
        return new y7a(i, c8aVar, ppbVar, map);
    }

    @Override
    public final y6a d() {
        return descriptor;
    }
}

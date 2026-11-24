package defpackage;

import java.util.Map;
public final class u5a implements gs4 {
    public static final u5a a;
    private static final w4a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        gd8 gd8Var = new gd8("com.google.firebase.sessions.SessionData", obj, 3);
        gd8Var.j("sessionDetails", false);
        gd8Var.j("backgroundTime", true);
        gd8Var.j("processDataMap", true);
        descriptor = gd8Var;
    }

    @Override
    public final cv5[] a() {
        return new cv5[]{y5a.a, vpd.a(mnb.a), vpd.a((cv5) w5a.d[2].getValue())};
    }

    @Override
    public final void b(c30 c30Var, Object obj) {
        w5a w5aVar = (w5a) obj;
        w5aVar.getClass();
        w4a w4aVar = descriptor;
        c30 a2 = c30Var.a(w4aVar);
        d06[] d06VarArr = w5a.d;
        y5a y5aVar = y5a.a;
        a6a a6aVar = w5aVar.a;
        Map map = w5aVar.c;
        onb onbVar = w5aVar.b;
        a2.i(w4aVar, 0, y5aVar, a6aVar);
        if (a2.p(w4aVar) || onbVar != null) {
            a2.h(w4aVar, 1, mnb.a, onbVar);
        }
        if (a2.p(w4aVar) || map != null) {
            a2.h(w4aVar, 2, (cv5) d06VarArr[2].getValue(), map);
        }
        a2.l(w4aVar);
    }

    @Override
    public final Object c(igf igfVar) {
        w4a w4aVar = descriptor;
        igf a2 = igfVar.a(w4aVar);
        d06[] d06VarArr = w5a.d;
        a6a a6aVar = null;
        boolean z = true;
        int i = 0;
        onb onbVar = null;
        Map map = null;
        while (z) {
            int b = a2.b(w4aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2) {
                            map = (Map) a2.j(w4aVar, 2, (cv5) d06VarArr[2].getValue(), map);
                            i |= 4;
                        } else {
                            throw new tu5(b);
                        }
                    } else {
                        onbVar = (onb) a2.j(w4aVar, 1, mnb.a, onbVar);
                        i |= 2;
                    }
                } else {
                    a6aVar = (a6a) a2.k(w4aVar, 0, y5a.a, a6aVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(w4aVar);
        return new w5a(i, a6aVar, onbVar, map);
    }

    @Override
    public final w4a d() {
        return descriptor;
    }
}

package defpackage;
public final class r5a implements gs4 {
    public static final r5a a;
    private static final w4a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        gd8 gd8Var = new gd8("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        gd8Var.j("sessionsEnabled", false);
        gd8Var.j("sessionSamplingRate", false);
        gd8Var.j("sessionTimeoutSeconds", false);
        gd8Var.j("cacheDurationSeconds", false);
        gd8Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = gd8Var;
    }

    @Override
    public final cv5[] a() {
        cv5 a2 = vpd.a(hm0.a);
        cv5 a3 = vpd.a(ep3.a);
        gp5 gp5Var = gp5.a;
        return new cv5[]{a2, a3, vpd.a(gp5Var), vpd.a(gp5Var), vpd.a(uf6.a)};
    }

    @Override
    public final void b(c30 c30Var, Object obj) {
        t5a t5aVar = (t5a) obj;
        t5aVar.getClass();
        w4a w4aVar = descriptor;
        c30 a2 = c30Var.a(w4aVar);
        a2.h(w4aVar, 0, hm0.a, t5aVar.a);
        a2.h(w4aVar, 1, ep3.a, t5aVar.b);
        gp5 gp5Var = gp5.a;
        a2.h(w4aVar, 2, gp5Var, t5aVar.c);
        a2.h(w4aVar, 3, gp5Var, t5aVar.d);
        a2.h(w4aVar, 4, uf6.a, t5aVar.e);
        a2.l(w4aVar);
    }

    @Override
    public final Object c(igf igfVar) {
        w4a w4aVar = descriptor;
        igf a2 = igfVar.a(w4aVar);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int b = a2.b(w4aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 4) {
                                    l = (Long) a2.j(w4aVar, 4, uf6.a, l);
                                    i |= 16;
                                } else {
                                    throw new tu5(b);
                                }
                            } else {
                                num2 = (Integer) a2.j(w4aVar, 3, gp5.a, num2);
                                i |= 8;
                            }
                        } else {
                            num = (Integer) a2.j(w4aVar, 2, gp5.a, num);
                            i |= 4;
                        }
                    } else {
                        d = (Double) a2.j(w4aVar, 1, ep3.a, d);
                        i |= 2;
                    }
                } else {
                    bool = (Boolean) a2.j(w4aVar, 0, hm0.a, bool);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(w4aVar);
        return new t5a(i, bool, d, num, num2, l);
    }

    @Override
    public final w4a d() {
        return descriptor;
    }
}

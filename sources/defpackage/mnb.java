package defpackage;
public final class mnb implements gs4 {
    public static final mnb a;
    private static final w4a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        gd8 gd8Var = new gd8("com.google.firebase.sessions.Time", obj, 3);
        gd8Var.j("ms", false);
        gd8Var.j("us", true);
        gd8Var.j("seconds", true);
        descriptor = gd8Var;
    }

    @Override
    public final cv5[] a() {
        uf6 uf6Var = uf6.a;
        return new cv5[]{uf6Var, uf6Var, uf6Var};
    }

    @Override
    public final void b(c30 c30Var, Object obj) {
        onb onbVar = (onb) obj;
        onbVar.getClass();
        w4a w4aVar = descriptor;
        c30 a2 = c30Var.a(w4aVar);
        long j = onbVar.a;
        long j2 = onbVar.c;
        long j3 = onbVar.b;
        a2.f(w4aVar, 0, j);
        if (a2.p(w4aVar) || j3 != j * 1000) {
            a2.f(w4aVar, 1, j3);
        }
        if (a2.p(w4aVar) || j2 != j / 1000) {
            a2.f(w4aVar, 2, j2);
        }
        a2.l(w4aVar);
    }

    @Override
    public final Object c(igf igfVar) {
        w4a w4aVar = descriptor;
        igf a2 = igfVar.a(w4aVar);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(w4aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2) {
                            j3 = a2.h(w4aVar, 2);
                            i |= 4;
                        } else {
                            throw new tu5(b);
                        }
                    } else {
                        j2 = a2.h(w4aVar, 1);
                        i |= 2;
                    }
                } else {
                    j = a2.h(w4aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(w4aVar);
        return new onb(i, j, j2, j3);
    }

    @Override
    public final w4a d() {
        return descriptor;
    }
}

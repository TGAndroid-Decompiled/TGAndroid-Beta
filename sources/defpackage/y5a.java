package defpackage;
public final class y5a implements gs4 {
    public static final y5a a;
    private static final w4a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        gd8 gd8Var = new gd8("com.google.firebase.sessions.SessionDetails", obj, 4);
        gd8Var.j("sessionId", false);
        gd8Var.j("firstSessionId", false);
        gd8Var.j("sessionIndex", false);
        gd8Var.j("sessionStartTimestampUs", false);
        descriptor = gd8Var;
    }

    @Override
    public final cv5[] a() {
        c9b c9bVar = c9b.a;
        return new cv5[]{c9bVar, c9bVar, gp5.a, uf6.a};
    }

    @Override
    public final void b(c30 c30Var, Object obj) {
        a6a a6aVar = (a6a) obj;
        a6aVar.getClass();
        w4a w4aVar = descriptor;
        c30 a2 = c30Var.a(w4aVar);
        String str = a6aVar.a;
        str.getClass();
        a2.c(w4aVar, 0);
        a2.k(str);
        String str2 = a6aVar.b;
        str2.getClass();
        a2.c(w4aVar, 1);
        a2.k(str2);
        int i = a6aVar.c;
        a2.c(w4aVar, 2);
        a2.d(i);
        a2.f(w4aVar, 3, a6aVar.d);
        a2.l(w4aVar);
    }

    @Override
    public final Object c(igf igfVar) {
        w4a w4aVar = descriptor;
        igf a2 = igfVar.a(w4aVar);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(w4aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b == 3) {
                                j = a2.h(w4aVar, 3);
                                i |= 8;
                            } else {
                                throw new tu5(b);
                            }
                        } else {
                            i2 = a2.e(w4aVar, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = a2.n(w4aVar, 1);
                        i |= 2;
                    }
                } else {
                    str = a2.n(w4aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(w4aVar);
        return new a6a(i, str, str2, i2, j);
    }

    @Override
    public final w4a d() {
        return descriptor;
    }
}

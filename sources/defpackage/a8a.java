package defpackage;
public final class a8a implements hu4 {
    public static final a8a a;
    private static final y6a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        if8 if8Var = new if8("com.google.firebase.sessions.SessionDetails", obj, 4);
        if8Var.j("sessionId", false);
        if8Var.j("firstSessionId", false);
        if8Var.j("sessionIndex", false);
        if8Var.j("sessionStartTimestampUs", false);
        descriptor = if8Var;
    }

    @Override
    public final cx5[] a() {
        ebb ebbVar = ebb.a;
        return new cx5[]{ebbVar, ebbVar, gr5.a, uh6.a};
    }

    @Override
    public final void b(c40 c40Var, Object obj) {
        c8a c8aVar = (c8a) obj;
        c8aVar.getClass();
        y6a y6aVar = descriptor;
        c40 a2 = c40Var.a(y6aVar);
        String str = c8aVar.a;
        str.getClass();
        a2.c(y6aVar, 0);
        a2.k(str);
        String str2 = c8aVar.b;
        str2.getClass();
        a2.c(y6aVar, 1);
        a2.k(str2);
        int i = c8aVar.c;
        a2.c(y6aVar, 2);
        a2.d(i);
        a2.f(y6aVar, 3, c8aVar.d);
        a2.l(y6aVar);
    }

    @Override
    public final Object c(jif jifVar) {
        y6a y6aVar = descriptor;
        jif a2 = jifVar.a(y6aVar);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(y6aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b == 3) {
                                j = a2.h(y6aVar, 3);
                                i |= 8;
                            } else {
                                throw new tw5(b);
                            }
                        } else {
                            i2 = a2.f(y6aVar, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = a2.n(y6aVar, 1);
                        i |= 2;
                    }
                } else {
                    str = a2.n(y6aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(y6aVar);
        return new c8a(i, str, str2, i2, j);
    }

    @Override
    public final y6a d() {
        return descriptor;
    }
}

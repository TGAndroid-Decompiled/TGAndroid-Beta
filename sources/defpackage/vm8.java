package defpackage;
public final class vm8 implements hu4 {
    public static final vm8 a;
    private static final y6a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        if8 if8Var = new if8("com.google.firebase.sessions.ProcessData", obj, 2);
        if8Var.j("pid", false);
        if8Var.j("uuid", false);
        descriptor = if8Var;
    }

    @Override
    public final cx5[] a() {
        return new cx5[]{gr5.a, ebb.a};
    }

    @Override
    public final void b(c40 c40Var, Object obj) {
        xm8 xm8Var = (xm8) obj;
        xm8Var.getClass();
        y6a y6aVar = descriptor;
        c40 a2 = c40Var.a(y6aVar);
        int i = xm8Var.a;
        a2.c(y6aVar, 0);
        a2.d(i);
        String str = xm8Var.b;
        str.getClass();
        a2.c(y6aVar, 1);
        a2.k(str);
        a2.l(y6aVar);
    }

    @Override
    public final Object c(jif jifVar) {
        y6a y6aVar = descriptor;
        jif a2 = jifVar.a(y6aVar);
        String str = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int b = a2.b(y6aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b == 1) {
                        str = a2.n(y6aVar, 1);
                        i |= 2;
                    } else {
                        throw new tw5(b);
                    }
                } else {
                    i2 = a2.f(y6aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(y6aVar);
        return new xm8(i, i2, str);
    }

    @Override
    public final y6a d() {
        return descriptor;
    }
}

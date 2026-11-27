package defpackage;
public final class go8 implements ku4 {
    public static final go8 a;
    private static final o8a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        ug8 ug8Var = new ug8("com.google.firebase.sessions.ProcessData", obj, 2);
        ug8Var.j("pid", false);
        ug8Var.j("uuid", false);
        descriptor = ug8Var;
    }

    @Override
    public final hx5[] a() {
        return new hx5[]{jr5.a, adb.a};
    }

    @Override
    public final void b(d30 d30Var, Object obj) {
        io8 io8Var = (io8) obj;
        io8Var.getClass();
        o8a o8aVar = descriptor;
        d30 a2 = d30Var.a(o8aVar);
        int i = io8Var.a;
        a2.c(o8aVar, 0);
        a2.d(i);
        String str = io8Var.b;
        str.getClass();
        a2.c(o8aVar, 1);
        a2.k(str);
        a2.l(o8aVar);
    }

    @Override
    public final Object c(ykf ykfVar) {
        o8a o8aVar = descriptor;
        ykf a2 = ykfVar.a(o8aVar);
        String str = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int b = a2.b(o8aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b == 1) {
                        str = a2.n(o8aVar, 1);
                        i |= 2;
                    } else {
                        throw new yw5(b);
                    }
                } else {
                    i2 = a2.e(o8aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(o8aVar);
        return new io8(i, i2, str);
    }

    @Override
    public final o8a d() {
        return descriptor;
    }
}

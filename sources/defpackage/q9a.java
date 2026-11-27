package defpackage;
public final class q9a implements ku4 {
    public static final q9a a;
    private static final o8a descriptor;

    static {
        ?? obj = new Object();
        a = obj;
        ug8 ug8Var = new ug8("com.google.firebase.sessions.SessionDetails", obj, 4);
        ug8Var.j("sessionId", false);
        ug8Var.j("firstSessionId", false);
        ug8Var.j("sessionIndex", false);
        ug8Var.j("sessionStartTimestampUs", false);
        descriptor = ug8Var;
    }

    @Override
    public final hx5[] a() {
        adb adbVar = adb.a;
        return new hx5[]{adbVar, adbVar, jr5.a, yh6.a};
    }

    @Override
    public final void b(d30 d30Var, Object obj) {
        s9a s9aVar = (s9a) obj;
        s9aVar.getClass();
        o8a o8aVar = descriptor;
        d30 a2 = d30Var.a(o8aVar);
        String str = s9aVar.a;
        str.getClass();
        a2.c(o8aVar, 0);
        a2.k(str);
        String str2 = s9aVar.b;
        str2.getClass();
        a2.c(o8aVar, 1);
        a2.k(str2);
        int i = s9aVar.c;
        a2.c(o8aVar, 2);
        a2.d(i);
        a2.f(o8aVar, 3, s9aVar.d);
        a2.l(o8aVar);
    }

    @Override
    public final Object c(ykf ykfVar) {
        o8a o8aVar = descriptor;
        ykf a2 = ykfVar.a(o8aVar);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(o8aVar);
            if (b != -1) {
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b == 3) {
                                j = a2.h(o8aVar, 3);
                                i |= 8;
                            } else {
                                throw new yw5(b);
                            }
                        } else {
                            i2 = a2.e(o8aVar, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = a2.n(o8aVar, 1);
                        i |= 2;
                    }
                } else {
                    str = a2.n(o8aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.o(o8aVar);
        return new s9a(i, str, str2, i2, j);
    }

    @Override
    public final o8a d() {
        return descriptor;
    }
}

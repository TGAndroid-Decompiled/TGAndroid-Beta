package defpackage;
public final class n69 implements k8a {
    public static final int g;
    public static final h59 h;
    public final snb a;
    public final rg4 b;
    public final sr c;
    public final p69 d;
    public final h8a e;
    public final nh7 f;

    static {
        int i = jr3.d;
        g = (int) jr3.d(vee.c(24, nr3.HOURS), nr3.SECONDS);
        h = new h59("com/google/firebase/sessions//");
    }

    public n69(snb snbVar, rg4 rg4Var, sr srVar, p69 p69Var, h8a h8aVar) {
        snbVar.getClass();
        rg4Var.getClass();
        srVar.getClass();
        p69Var.getClass();
        h8aVar.getClass();
        this.a = snbVar;
        this.b = rg4Var;
        this.c = srVar;
        this.d = p69Var;
        this.e = h8aVar;
        this.f = new nh7();
    }

    public static String e(String str) {
        h59 h59Var = h;
        h59Var.getClass();
        String replaceAll = h59Var.a.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    @Override
    public final java.lang.Object a(defpackage.fw2 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n69.a(fw2):java.lang.Object");
    }

    @Override
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override
    public final jr3 c() {
        Integer num = this.e.a().c;
        if (num != null) {
            int i = jr3.d;
            return new jr3(vee.c(num.intValue(), nr3.SECONDS));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.e.a().b;
    }
}

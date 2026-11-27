package defpackage;
public final class aa9 implements bca {
    public static final int g;
    public static final u89 h;
    public final srb a;
    public final ri4 b;
    public final tr c;
    public final ca9 d;
    public final yba e;
    public final xj7 f;

    static {
        int i = bs3.d;
        g = (int) bs3.d(mje.c(24, fs3.HOURS), fs3.SECONDS);
        h = new u89("com/google/firebase/sessions//");
    }

    public aa9(srb srbVar, ri4 ri4Var, tr trVar, ca9 ca9Var, yba ybaVar) {
        srbVar.getClass();
        ri4Var.getClass();
        trVar.getClass();
        ca9Var.getClass();
        ybaVar.getClass();
        this.a = srbVar;
        this.b = ri4Var;
        this.c = trVar;
        this.d = ca9Var;
        this.e = ybaVar;
        this.f = new xj7();
    }

    public static String e(String str) {
        u89 u89Var = h;
        u89Var.getClass();
        String replaceAll = u89Var.a.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    @Override
    public final java.lang.Object a(defpackage.zw2 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa9.a(zw2):java.lang.Object");
    }

    @Override
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override
    public final bs3 c() {
        Integer num = this.e.a().c;
        if (num != null) {
            int i = bs3.d;
            return new bs3(mje.c(num.intValue(), fs3.SECONDS));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.e.a().b;
    }
}

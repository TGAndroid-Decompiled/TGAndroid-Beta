package defpackage;
public final class p89 implements kaa {
    public static final int g;
    public static final j79 h;
    public final tpb a;
    public final ti4 b;
    public final ss c;
    public final r89 d;
    public final haa e;
    public final qj7 f;

    static {
        int i = ts3.d;
        g = (int) ts3.d(wge.c(24, xs3.HOURS), xs3.SECONDS);
        h = new j79("com/google/firebase/sessions//");
    }

    public p89(tpb tpbVar, ti4 ti4Var, ss ssVar, r89 r89Var, haa haaVar) {
        tpbVar.getClass();
        ti4Var.getClass();
        ssVar.getClass();
        r89Var.getClass();
        haaVar.getClass();
        this.a = tpbVar;
        this.b = ti4Var;
        this.c = ssVar;
        this.d = r89Var;
        this.e = haaVar;
        this.f = new qj7();
    }

    public static String e(String str) {
        j79 j79Var = h;
        j79Var.getClass();
        String replaceAll = j79Var.a.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    @Override
    public final java.lang.Object a(defpackage.px2 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p89.a(px2):java.lang.Object");
    }

    @Override
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override
    public final ts3 c() {
        Integer num = this.e.a().c;
        if (num != null) {
            int i = ts3.d;
            return new ts3(wge.c(num.intValue(), xs3.SECONDS));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.e.a().b;
    }
}

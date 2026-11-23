package hb;

import c8.h9;
public final class d {
    public static final d f14117a;
    public static final d f14118b;
    public static final d[] f14119c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f14117a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f14118b = r12;
        d[] dVarArr = {r02, r12, new Enum("MATT_SAYS_HI", 2)};
        f14119c = dVarArr;
        h9.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14119c.clone();
    }
}

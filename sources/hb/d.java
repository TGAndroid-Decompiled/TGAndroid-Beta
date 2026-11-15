package hb;

import c8.l1;
public final class d {
    public static final d f13808a;
    public static final d f13809b;
    public static final d[] f13810c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f13808a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f13809b = r12;
        d[] dVarArr = {r02, r12, new Enum("MATT_SAYS_HI", 2)};
        f13810c = dVarArr;
        l1.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13810c.clone();
    }
}

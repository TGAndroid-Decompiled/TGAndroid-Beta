package jd;

import i7.i8;
public final class d0 {
    public static final d0 f11455a;
    public static final d0[] f11456b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11455a = r02;
        d0[] d0VarArr = {r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
        f11456b = d0VarArr;
        i8.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f11456b.clone();
    }
}

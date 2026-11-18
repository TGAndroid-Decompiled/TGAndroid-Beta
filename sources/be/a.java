package be;

import c8.n1;
public final class a {
    public static final a f3135a;
    public static final a f3136b;
    public static final a f3137c;
    public static final a[] d;

    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f3135a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f3136b = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f3137c = r32;
        a[] aVarArr = {r02, r12, r32};
        d = aVarArr;
        n1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}

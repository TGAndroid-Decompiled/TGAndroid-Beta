package be;

import c8.n1;
public final class a {
    public static final a f3134a;
    public static final a f3135b;
    public static final a f3136c;
    public static final a[] d;

    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f3134a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f3135b = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f3136c = r32;
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

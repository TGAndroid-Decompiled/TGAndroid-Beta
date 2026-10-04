package jd;

import w7.n;
public final class a {
    public static final a f14087a;
    public static final a[] f14088b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f14087a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f14088b = aVarArr;
        n.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14088b.clone();
    }
}

package jd;

import c8.l1;
public final class a {
    public static final a f16999a;
    public static final a[] f17000b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f16999a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f17000b = aVarArr;
        l1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17000b.clone();
    }
}

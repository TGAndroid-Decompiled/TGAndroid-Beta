package jd;

import c8.h9;
public final class a {
    public static final a f17478a;
    public static final a[] f17479b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f17478a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f17479b = aVarArr;
        h9.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17479b.clone();
    }
}

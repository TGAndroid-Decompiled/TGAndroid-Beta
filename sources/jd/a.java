package jd;

import c8.n1;
public final class a {
    public static final a f17384a;
    public static final a[] f17385b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f17384a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f17385b = aVarArr;
        n1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17385b.clone();
    }
}

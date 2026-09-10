package jd;

import w7.m;
public final class a {
    public static final a f11861a;
    public static final a[] f11862b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f11861a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f11862b = aVarArr;
        m.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11862b.clone();
    }
}

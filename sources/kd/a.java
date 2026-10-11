package kd;

import w7.v;
public final class a {
    public static final a f14783a;
    public static final a[] f14784b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f14783a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f14784b = aVarArr;
        v.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14784b.clone();
    }
}

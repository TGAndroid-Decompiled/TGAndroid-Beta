package kd;

import w7.v;
public final class a {
    public static final a f14784a;
    public static final a[] f14785b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f14784a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f14785b = aVarArr;
        v.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14785b.clone();
    }
}

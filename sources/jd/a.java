package jd;

import c8.j1;
public final class a {
    public static final a f16646a;
    public static final a[] f16647b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f16646a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f16647b = aVarArr;
        j1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16647b.clone();
    }
}

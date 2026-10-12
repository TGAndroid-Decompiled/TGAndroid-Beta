package kd;

import w7.u;
public final class a {
    public static final a f14780a;
    public static final a[] f14781b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f14780a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f14781b = aVarArr;
        u.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14781b.clone();
    }
}

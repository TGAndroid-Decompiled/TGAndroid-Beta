package ld;

import w7.c0;
public final class a {
    public static final a f16062a;
    public static final a[] f16063b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f16062a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f16063b = aVarArr;
        c0.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16063b.clone();
    }
}

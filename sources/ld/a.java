package ld;

import w7.c0;
public final class a {
    public static final a f15993a;
    public static final a[] f15994b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f15993a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f15994b = aVarArr;
        c0.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15994b.clone();
    }
}

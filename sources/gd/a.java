package gd;

import b8.zc;
public final class a {
    public static final a f12241a;
    public static final a[] f12242b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f12241a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f12242b = aVarArr;
        zc.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12242b.clone();
    }
}

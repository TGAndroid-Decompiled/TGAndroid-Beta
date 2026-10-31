package dd;

import v7.g7;
public final class a {
    public static final a f5864a;
    public static final a[] f5865b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f5864a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f5865b = aVarArr;
        g7.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5865b.clone();
    }
}

package md;

import a8.we;
public final class a {
    public static final a f18412a;
    public static final a[] f18413b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f18412a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f18413b = aVarArr;
        we.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18413b.clone();
    }
}

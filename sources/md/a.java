package md;

import a8.we;
public final class a {
    public static final a f18411a;
    public static final a[] f18412b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f18411a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f18412b = aVarArr;
        we.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18412b.clone();
    }
}

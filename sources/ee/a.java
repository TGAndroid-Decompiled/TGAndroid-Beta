package ee;

import a8.we;
public final class a {
    public static final a[] f9893a;

    static {
        a[] aVarArr = {new Enum("SUSPEND", 0), new Enum("DROP_OLDEST", 1), new Enum("DROP_LATEST", 2)};
        f9893a = aVarArr;
        we.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9893a.clone();
    }
}

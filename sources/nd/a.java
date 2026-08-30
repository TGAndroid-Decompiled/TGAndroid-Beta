package nd;

import k7.o8;
public final class a {
    public static final a[] f14912a;

    static {
        a[] aVarArr = {new Enum("SUSPEND", 0), new Enum("DROP_OLDEST", 1), new Enum("DROP_LATEST", 2)};
        f14912a = aVarArr;
        o8.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14912a.clone();
    }
}

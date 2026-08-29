package ld;

import i7.i8;
public final class a {
    public static final a[] f15159a;

    static {
        a[] aVarArr = {new Enum("SUSPEND", 0), new Enum("DROP_OLDEST", 1), new Enum("DROP_LATEST", 2)};
        f15159a = aVarArr;
        i8.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15159a.clone();
    }
}

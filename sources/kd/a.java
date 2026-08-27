package kd;

import h7.s7;

public final class a {

    public static final a[] f15155a;

    a EF5;

    static {
        a[] aVarArr = {new a("SUSPEND", 0), new a("DROP_OLDEST", 1), new a("DROP_LATEST", 2)};
        f15155a = aVarArr;
        s7.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15155a.clone();
    }
}

package de;

import w7.d0;
public final class a {
    public static final a[] f6485a;

    static {
        a[] aVarArr = {new Enum("SUSPEND", 0), new Enum("DROP_OLDEST", 1), new Enum("DROP_LATEST", 2)};
        f6485a = aVarArr;
        d0.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6485a.clone();
    }
}

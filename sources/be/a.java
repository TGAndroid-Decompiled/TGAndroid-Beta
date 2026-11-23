package be;

import c8.h9;
public final class a {
    public static final a f3105a;
    public static final a f3106b;
    public static final a f3107c;
    public static final a[] d;

    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f3105a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f3106b = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f3107c = r32;
        a[] aVarArr = {r02, r12, r32};
        d = aVarArr;
        h9.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}

package be;

import c8.l1;
public final class a {
    public static final a f3140a;
    public static final a f3141b;
    public static final a f3142c;
    public static final a[] d;

    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f3140a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f3141b = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f3142c = r32;
        a[] aVarArr = {r02, r12, r32};
        d = aVarArr;
        l1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}

package be;

import c8.j1;
public final class a {
    public static final a f3182a;
    public static final a f3183b;
    public static final a f3184c;
    public static final a[] d;

    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f3182a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f3183b = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f3184c = r32;
        a[] aVarArr = {r02, r12, r32};
        d = aVarArr;
        j1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}

package gb;

import c8.h9;
public final class a1 {
    public static final a1 f13281a;
    public static final a1 f13282b;
    public static final a1[] f13283c;

    static {
        ?? r02 = new Enum("GENERAL", 0);
        f13281a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f13282b = r12;
        a1[] a1VarArr = {r02, r12};
        f13283c = a1VarArr;
        h9.a(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f13283c.clone();
    }
}

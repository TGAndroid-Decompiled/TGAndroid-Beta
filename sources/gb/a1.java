package gb;

import c8.n1;
public final class a1 {
    public static final a1 f13315a;
    public static final a1 f13316b;
    public static final a1[] f13317c;

    static {
        ?? r02 = new Enum("GENERAL", 0);
        f13315a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f13316b = r12;
        a1[] a1VarArr = {r02, r12};
        f13317c = a1VarArr;
        n1.a(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f13317c.clone();
    }
}

package gb;

import c8.l1;
public final class a1 {
    public static final a1 f12972a;
    public static final a1 f12973b;
    public static final a1[] f12974c;

    static {
        ?? r02 = new Enum("GENERAL", 0);
        f12972a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f12973b = r12;
        a1[] a1VarArr = {r02, r12};
        f12974c = a1VarArr;
        l1.a(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f12974c.clone();
    }
}

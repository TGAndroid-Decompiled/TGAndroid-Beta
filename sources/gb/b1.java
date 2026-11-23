package gb;

import c8.h9;
public final class b1 {
    public static final b1 f13285a;
    public static final b1 f13286b;
    public static final b1[] f13287c;

    static {
        ?? r02 = new Enum("GENERAL", 0);
        f13285a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f13286b = r12;
        b1[] b1VarArr = {r02, r12};
        f13287c = b1VarArr;
        h9.a(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f13287c.clone();
    }
}

package db;

import b8.zc;
public final class b1 {
    public static final b1 f8608a;
    public static final b1 f8609b;
    public static final b1[] f8610c;

    static {
        ?? r02 = new Enum("GENERAL", 0);
        f8608a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f8609b = r12;
        b1[] b1VarArr = {r02, r12};
        f8610c = b1VarArr;
        zc.a(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f8610c.clone();
    }
}

package ld;

import k7.o8;
public final class d0 {
    public static final d0 f11868a;
    public static final d0[] f11869b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11868a = r02;
        d0[] d0VarArr = {r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
        f11869b = d0VarArr;
        o8.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f11869b.clone();
    }
}

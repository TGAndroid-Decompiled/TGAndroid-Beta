package ge;

import w7.n;
public final class b {
    public static final b f9609a;
    public static final b f9610b;
    public static final b f9611c;
    public static final b d;
    public static final b e;
    public static final b[] f9612f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f9609a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f9610b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f9611c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f9612f = bVarArr;
        n.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f9612f.clone();
    }
}

package ge;

import w7.n;
public final class b {
    public static final b f10460a;
    public static final b f10461b;
    public static final b f10462c;
    public static final b d;
    public static final b f10463e;
    public static final b[] f10464f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f10460a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f10461b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f10462c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f10463e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f10464f = bVarArr;
        n.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10464f.clone();
    }
}

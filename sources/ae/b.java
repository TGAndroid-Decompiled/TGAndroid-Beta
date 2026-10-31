package ae;

import v7.g7;
public final class b {
    public static final b f408a;
    public static final b f409b;
    public static final b f410c;
    public static final b d;
    public static final b e;
    public static final b[] f411f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f408a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f409b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f410c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f411f = bVarArr;
        g7.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f411f.clone();
    }
}

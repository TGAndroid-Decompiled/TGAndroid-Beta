package ie;

import w7.c0;
public final class b {
    public static final b f12814a;
    public static final b f12815b;
    public static final b f12816c;
    public static final b d;
    public static final b e;
    public static final b[] f12817f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f12814a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f12815b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f12816c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f12817f = bVarArr;
        c0.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12817f.clone();
    }
}

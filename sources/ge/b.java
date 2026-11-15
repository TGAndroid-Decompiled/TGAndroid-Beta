package ge;

import c8.l1;
public final class b {
    public static final b f13181a;
    public static final b f13182b;
    public static final b f13183c;
    public static final b d;
    public static final b f13184e;
    public static final b[] f13185f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13181a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13182b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13183c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13184e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13185f = bVarArr;
        l1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13185f.clone();
    }
}

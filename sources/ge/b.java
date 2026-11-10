package ge;

import c8.j1;
public final class b {
    public static final b f13839a;
    public static final b f13840b;
    public static final b f13841c;
    public static final b d;
    public static final b f13842e;
    public static final b[] f13843f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13839a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13840b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13841c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13842e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13843f = bVarArr;
        j1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13843f.clone();
    }
}

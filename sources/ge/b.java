package ge;

import c8.n1;
public final class b {
    public static final b f13493a;
    public static final b f13494b;
    public static final b f13495c;
    public static final b d;
    public static final b f13496e;
    public static final b[] f13497f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13493a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13494b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13495c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13496e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13497f = bVarArr;
        n1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13497f.clone();
    }
}

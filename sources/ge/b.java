package ge;

import c8.h9;
public final class b {
    public static final b f13488a;
    public static final b f13489b;
    public static final b f13490c;
    public static final b d;
    public static final b f13491e;
    public static final b[] f13492f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13488a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13489b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13490c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13491e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13492f = bVarArr;
        h9.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13492f.clone();
    }
}

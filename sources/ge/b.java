package ge;

import c8.n1;
public final class b {
    public static final b f13522a;
    public static final b f13523b;
    public static final b f13524c;
    public static final b d;
    public static final b f13525e;
    public static final b[] f13526f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13522a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13523b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13524c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13525e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13526f = bVarArr;
        n1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13526f.clone();
    }
}

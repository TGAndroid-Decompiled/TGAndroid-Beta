package ge;

import c8.n1;
public final class b {
    public static final b f13496a;
    public static final b f13497b;
    public static final b f13498c;
    public static final b d;
    public static final b f13499e;
    public static final b[] f13500f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13496a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13497b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13498c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13499e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13500f = bVarArr;
        n1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13500f.clone();
    }
}

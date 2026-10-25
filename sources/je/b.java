package je;

import a8.we;
public final class b {
    public static final b f15587a;
    public static final b f15588b;
    public static final b f15589c;
    public static final b d;
    public static final b e;
    public static final b[] f15590f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f15587a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f15588b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f15589c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f15590f = bVarArr;
        we.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f15590f.clone();
    }
}

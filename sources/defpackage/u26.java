package defpackage;
public final class u26 {
    private static final u26[] $VALUES;
    public static final s26 Companion;
    public static final u26 ON_ANY;
    public static final u26 ON_CREATE;
    public static final u26 ON_DESTROY;
    public static final u26 ON_PAUSE;
    public static final u26 ON_RESUME;
    public static final u26 ON_START;
    public static final u26 ON_STOP;

    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r3 = new Enum("ON_RESUME", 2);
        ON_RESUME = r3;
        ?? r5 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r5;
        ?? r7 = new Enum("ON_STOP", 4);
        ON_STOP = r7;
        ?? r9 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r9;
        ?? r11 = new Enum("ON_ANY", 6);
        ON_ANY = r11;
        $VALUES = new u26[]{r0, r1, r3, r5, r7, r9, r11};
        Companion = new Object();
    }

    public static u26 valueOf(String str) {
        return (u26) Enum.valueOf(u26.class, str);
    }

    public static u26[] values() {
        return (u26[]) $VALUES.clone();
    }

    public final v26 a() {
        switch (t26.a[ordinal()]) {
            case 1:
            case 2:
                return v26.c;
            case 3:
            case 4:
                return v26.d;
            case 5:
                return v26.e;
            case 6:
                return v26.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

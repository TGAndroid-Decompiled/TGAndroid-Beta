package defpackage;
public final class u06 {
    private static final u06[] $VALUES;
    public static final s06 Companion;
    public static final u06 ON_ANY;
    public static final u06 ON_CREATE;
    public static final u06 ON_DESTROY;
    public static final u06 ON_PAUSE;
    public static final u06 ON_RESUME;
    public static final u06 ON_START;
    public static final u06 ON_STOP;

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
        $VALUES = new u06[]{r0, r1, r3, r5, r7, r9, r11};
        Companion = new Object();
    }

    public static u06 valueOf(String str) {
        return (u06) Enum.valueOf(u06.class, str);
    }

    public static u06[] values() {
        return (u06[]) $VALUES.clone();
    }

    public final v06 a() {
        switch (t06.a[ordinal()]) {
            case 1:
            case 2:
                return v06.c;
            case 3:
            case 4:
                return v06.d;
            case 5:
                return v06.e;
            case 6:
                return v06.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

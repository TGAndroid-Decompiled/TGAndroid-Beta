package li;
public final class r0 {
    public static final r0 f12237a;
    public static final r0 f12238b;
    public static final r0 f12239c;
    public static final r0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f12237a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f12238b = r12;
        ?? r32 = new Enum("LOW", 2);
        f12239c = r32;
        d = new r0[]{r02, r12, r32};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) d.clone();
    }
}

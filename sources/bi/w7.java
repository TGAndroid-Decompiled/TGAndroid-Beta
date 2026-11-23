package bi;
public final class w7 {
    public static final w7 f4230a;
    public static final w7 f4231b;
    public static final w7 f4232c;
    public static final w7[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f4230a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f4231b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f4232c = r32;
        d = new w7[]{r02, r12, r32};
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) d.clone();
    }
}

package defpackage;
public final class i26 {
    public static final i26[] a = {new Enum("SYNCHRONIZED", 0), new Enum("PUBLICATION", 1), new Enum("NONE", 2)};
    i26 EF5;

    public static i26 valueOf(String str) {
        return (i26) Enum.valueOf(i26.class, str);
    }

    public static i26[] values() {
        return (i26[]) a.clone();
    }
}

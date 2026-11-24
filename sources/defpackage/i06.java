package defpackage;
public final class i06 {
    public static final i06[] a = {new Enum("SYNCHRONIZED", 0), new Enum("PUBLICATION", 1), new Enum("NONE", 2)};
    i06 EF5;

    public static i06 valueOf(String str) {
        return (i06) Enum.valueOf(i06.class, str);
    }

    public static i06[] values() {
        return (i06[]) a.clone();
    }
}

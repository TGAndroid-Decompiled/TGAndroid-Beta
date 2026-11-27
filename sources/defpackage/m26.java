package defpackage;
public final class m26 {
    public static final m26[] a = {new Enum("SYNCHRONIZED", 0), new Enum("PUBLICATION", 1), new Enum("NONE", 2)};
    m26 EF5;

    public static m26 valueOf(String str) {
        return (m26) Enum.valueOf(m26.class, str);
    }

    public static m26[] values() {
        return (m26[]) a.clone();
    }
}

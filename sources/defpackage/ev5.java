package defpackage;
public final class ev5 {
    public static final ev5[] a = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
    ev5 EF5;

    public static ev5 valueOf(String str) {
        return (ev5) Enum.valueOf(ev5.class, str);
    }

    public static ev5[] values() {
        return (ev5[]) a.clone();
    }
}

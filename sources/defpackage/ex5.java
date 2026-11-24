package defpackage;
public final class ex5 {
    public static final ex5[] a = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
    ex5 EF5;

    public static ex5 valueOf(String str) {
        return (ex5) Enum.valueOf(ex5.class, str);
    }

    public static ex5[] values() {
        return (ex5[]) a.clone();
    }
}

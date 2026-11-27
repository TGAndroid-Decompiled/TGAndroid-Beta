package defpackage;
public final class jx5 {
    public static final jx5[] a = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
    jx5 EF5;

    public static jx5 valueOf(String str) {
        return (jx5) Enum.valueOf(jx5.class, str);
    }

    public static jx5[] values() {
        return (jx5[]) a.clone();
    }
}

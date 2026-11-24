package defpackage;
public final class rha {
    public static final rha a;
    public static final rha b;
    public static final rha[] c;

    static {
        ?? r0 = new Enum("GLASS", 0);
        a = r0;
        ?? r1 = new Enum("ACCENT", 1);
        b = r1;
        c = new rha[]{r0, r1};
    }

    public static rha valueOf(String str) {
        return (rha) Enum.valueOf(rha.class, str);
    }

    public static rha[] values() {
        return (rha[]) c.clone();
    }
}

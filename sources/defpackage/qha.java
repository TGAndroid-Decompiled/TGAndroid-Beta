package defpackage;
public final class qha {
    public static final qha a;
    public static final qha b;
    public static final qha[] c;

    static {
        ?? r0 = new Enum("ICON", 0);
        a = r0;
        ?? r1 = new Enum("TEXT", 1);
        b = r1;
        c = new qha[]{r0, r1};
    }

    public static qha valueOf(String str) {
        return (qha) Enum.valueOf(qha.class, str);
    }

    public static qha[] values() {
        return (qha[]) c.clone();
    }
}

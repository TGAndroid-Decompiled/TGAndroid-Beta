package defpackage;
public final class vcd {
    public static final vcd a;
    public static final vcd[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new vcd[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static vcd[] values() {
        return (vcd[]) b.clone();
    }
}

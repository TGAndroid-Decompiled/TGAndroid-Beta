package defpackage;
public final class vod {
    public static final vod a;
    public static final vod[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new vod[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static vod[] values() {
        return (vod[]) b.clone();
    }
}

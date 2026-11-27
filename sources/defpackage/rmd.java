package defpackage;
public final class rmd {
    public static final rmd a;
    public static final rmd[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new rmd[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static rmd[] values() {
        return (rmd[]) b.clone();
    }
}

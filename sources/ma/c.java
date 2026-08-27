package ma;

public final class c {
    public static final c d = new c("", "", false);

    public final String f17894a;

    public final String f17895b;

    public final boolean f17896c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f17894a = str;
        this.f17895b = str2;
        this.f17896c = z10;
    }
}

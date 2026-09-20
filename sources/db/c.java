package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f7594a;
    public final String f7595b;
    public final boolean f7596c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f7594a = str;
                this.f7595b = str2;
                this.f7596c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

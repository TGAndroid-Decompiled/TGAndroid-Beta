package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f8246a;
    public final String f8247b;
    public final boolean f8248c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f8246a = str;
                this.f8247b = str2;
                this.f8248c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

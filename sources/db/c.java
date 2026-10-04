package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f8194a;
    public final String f8195b;
    public final boolean f8196c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f8194a = str;
                this.f8195b = str2;
                this.f8196c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f7578a;
    public final String f7579b;
    public final boolean f7580c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f7578a = str;
                this.f7579b = str2;
                this.f7580c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

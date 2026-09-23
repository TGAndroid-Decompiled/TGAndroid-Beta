package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f7577a;
    public final String f7578b;
    public final boolean f7579c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f7577a = str;
                this.f7578b = str2;
                this.f7579c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

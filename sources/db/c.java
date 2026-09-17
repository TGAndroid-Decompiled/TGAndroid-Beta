package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f6693a;
    public final String f6694b;
    public final boolean f6695c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f6693a = str;
                this.f6694b = str2;
                this.f6695c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

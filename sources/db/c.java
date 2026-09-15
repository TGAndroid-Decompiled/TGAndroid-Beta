package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f7589a;
    public final String f7590b;
    public final boolean f7591c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f7589a = str;
                this.f7590b = str2;
                this.f7591c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

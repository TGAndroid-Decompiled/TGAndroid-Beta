package db;
public final class c {
    public static final c d = new c("", "", false);
    public final String f6365a;
    public final String f6366b;
    public final boolean f6367c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f6365a = str;
                this.f6366b = str2;
                this.f6367c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

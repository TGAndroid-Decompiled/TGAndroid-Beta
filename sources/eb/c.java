package eb;
public final class c {
    public static final c d = new c("", "", false);
    public final String f8565a;
    public final String f8566b;
    public final boolean f8567c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f8565a = str;
                this.f8566b = str2;
                this.f8567c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

package la;
public final class c {
    public static final c d = new c("", "", false);
    public final String f16710a;
    public final String f16711b;
    public final boolean f16712c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f16710a = str;
                this.f16711b = str2;
                this.f16712c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

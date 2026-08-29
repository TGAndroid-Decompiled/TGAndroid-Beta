package na;
public final class c {
    public static final c d = new c("", "", false);
    public final String f17177a;
    public final String f17178b;
    public final boolean f17179c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f17177a = str;
                this.f17178b = str2;
                this.f17179c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

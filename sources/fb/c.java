package fb;
public final class c {
    public static final c d = new c("", "", false);
    public final String f10380a;
    public final String f10381b;
    public final boolean f10382c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f10380a = str;
                this.f10381b = str2;
                this.f10382c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

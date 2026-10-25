package fb;
public final class c {
    public static final c d = new c("", "", false);
    public final String f10381a;
    public final String f10382b;
    public final boolean f10383c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f10381a = str;
                this.f10382b = str2;
                this.f10383c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

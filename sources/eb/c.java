package eb;
public final class c {
    public static final c d = new c("", "", false);
    public final String f8679a;
    public final String f8680b;
    public final boolean f8681c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f8679a = str;
                this.f8680b = str2;
                this.f8681c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}

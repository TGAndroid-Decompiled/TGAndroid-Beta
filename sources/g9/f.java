package g9;
public final class f extends d {
    public final char f13243a;
    public final char f13244b;

    public f(char c10, char c11) {
        this.f13243a = c10;
        this.f13244b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13243a && c10 != this.f13244b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13243a) + i.a(this.f13244b) + "\")";
    }
}

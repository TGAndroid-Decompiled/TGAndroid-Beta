package g9;
public final class f extends d {
    public final char f13244a;
    public final char f13245b;

    public f(char c10, char c11) {
        this.f13244a = c10;
        this.f13245b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13244a && c10 != this.f13245b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13244a) + i.a(this.f13245b) + "\")";
    }
}

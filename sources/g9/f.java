package g9;
public final class f extends d {
    public final char f13587a;
    public final char f13588b;

    public f(char c10, char c11) {
        this.f13587a = c10;
        this.f13588b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13587a && c10 != this.f13588b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13587a) + i.a(this.f13588b) + "\")";
    }
}

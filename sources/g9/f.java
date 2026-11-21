package g9;
public final class f extends d {
    public final char f13278a;
    public final char f13279b;

    public f(char c10, char c11) {
        this.f13278a = c10;
        this.f13279b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13278a && c10 != this.f13279b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13278a) + i.a(this.f13279b) + "\")";
    }
}

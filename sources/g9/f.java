package g9;
public final class f extends d {
    public final char f13252a;
    public final char f13253b;

    public f(char c10, char c11) {
        this.f13252a = c10;
        this.f13253b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13252a && c10 != this.f13253b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13252a) + i.a(this.f13253b) + "\")";
    }
}

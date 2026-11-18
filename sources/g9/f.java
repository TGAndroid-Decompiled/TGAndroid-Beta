package g9;
public final class f extends d {
    public final char f13249a;
    public final char f13250b;

    public f(char c10, char c11) {
        this.f13249a = c10;
        this.f13250b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13249a && c10 != this.f13250b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13249a) + i.a(this.f13250b) + "\")";
    }
}

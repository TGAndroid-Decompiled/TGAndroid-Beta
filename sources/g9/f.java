package g9;
public final class f extends d {
    public final char f12935a;
    public final char f12936b;

    public f(char c10, char c11) {
        this.f12935a = c10;
        this.f12936b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f12935a && c10 != this.f12936b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f12935a) + i.a(this.f12936b) + "\")";
    }
}

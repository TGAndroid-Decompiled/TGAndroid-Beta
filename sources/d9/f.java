package d9;
public final class f extends d {
    public final char f6432a;
    public final char f6433b;

    public f(char c10, char c11) {
        this.f6432a = c10;
        this.f6433b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f6432a && c10 != this.f6433b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f6432a) + i.a(this.f6433b) + "\")";
    }
}

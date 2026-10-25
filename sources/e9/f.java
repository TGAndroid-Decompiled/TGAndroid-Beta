package e9;
public final class f extends d {
    public final char f9842a;
    public final char f9843b;

    public f(char c10, char c11) {
        this.f9842a = c10;
        this.f9843b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f9842a && c10 != this.f9843b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f9842a) + i.a(this.f9843b) + "\")";
    }
}

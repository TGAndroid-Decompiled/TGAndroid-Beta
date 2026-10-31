package d9;
public final class f extends d {
    public final char f5802a;
    public final char f5803b;

    public f(char c10, char c11) {
        this.f5802a = c10;
        this.f5803b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f5802a && c10 != this.f5803b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f5802a) + i.a(this.f5803b) + "\")";
    }
}

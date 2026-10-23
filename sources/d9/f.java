package d9;
public final class f extends d {
    public final char f7900a;
    public final char f7901b;

    public f(char c10, char c11) {
        this.f7900a = c10;
        this.f7901b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f7900a && c10 != this.f7901b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f7900a) + i.a(this.f7901b) + "\")";
    }
}

package d9;
public final class f extends d {
    public final char f7891a;
    public final char f7892b;

    public f(char c10, char c11) {
        this.f7891a = c10;
        this.f7892b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f7891a && c10 != this.f7892b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f7891a) + i.a(this.f7892b) + "\")";
    }
}

package f9;
public final class f extends d {
    public final char f11509a;
    public final char f11510b;

    public f(char c2, char c10) {
        this.f11509a = c2;
        this.f11510b = c10;
    }

    @Override
    public final boolean c(char c2) {
        if (c2 != this.f11509a && c2 != this.f11510b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f11509a) + i.a(this.f11510b) + "\")";
    }
}

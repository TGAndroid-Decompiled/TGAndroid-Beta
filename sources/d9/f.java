package d9;
public final class f extends d {
    public final char f7890a;
    public final char f7891b;

    public f(char c10, char c11) {
        this.f7890a = c10;
        this.f7891b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f7890a && c10 != this.f7891b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f7890a) + i.a(this.f7891b) + "\")";
    }
}

package d9;
public final class f extends d {
    public final char f6435a;
    public final char f6436b;

    public f(char c10, char c11) {
        this.f6435a = c10;
        this.f6436b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f6435a && c10 != this.f6436b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f6435a) + i.a(this.f6436b) + "\")";
    }
}

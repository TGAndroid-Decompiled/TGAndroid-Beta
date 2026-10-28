package e9;
public final class f extends d {
    public final char f9841a;
    public final char f9842b;

    public f(char c10, char c11) {
        this.f9841a = c10;
        this.f9842b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f9841a && c10 != this.f9842b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f9841a) + i.a(this.f9842b) + "\")";
    }
}

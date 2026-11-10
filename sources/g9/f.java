package g9;
public final class f extends d {
    public final char f13589a;
    public final char f13590b;

    public f(char c10, char c11) {
        this.f13589a = c10;
        this.f13590b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13589a && c10 != this.f13590b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13589a) + i.a(this.f13590b) + "\")";
    }
}

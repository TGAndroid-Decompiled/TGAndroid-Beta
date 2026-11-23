package g9;
public final class f extends d {
    public final char f13281a;
    public final char f13282b;

    public f(char c10, char c11) {
        this.f13281a = c10;
        this.f13282b = c11;
    }

    @Override
    public final boolean c(char c10) {
        if (c10 != this.f13281a && c10 != this.f13282b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.f13281a) + i.a(this.f13282b) + "\")";
    }
}

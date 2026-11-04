package f9;
public final class e extends d {
    public final int f11507a;
    public final char f11508b;

    public e(char c2, int i3) {
        this.f11507a = i3;
        this.f11508b = c2;
    }

    @Override
    public final boolean c(char c2) {
        switch (this.f11507a) {
            case 0:
                if (c2 == this.f11508b) {
                    return true;
                }
                return false;
            default:
                if (c2 != this.f11508b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f11507a) {
            case 0:
                return new e(this.f11508b, 1);
            default:
                return new e(this.f11508b, 0);
        }
    }

    public final String toString() {
        switch (this.f11507a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f11508b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f11508b) + "')";
        }
    }
}

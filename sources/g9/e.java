package g9;
public final class e extends d {
    public final int f13250a;
    public final char f13251b;

    public e(char c10, int i7) {
        this.f13250a = i7;
        this.f13251b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f13250a) {
            case 0:
                if (c10 == this.f13251b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f13251b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f13250a) {
            case 0:
                return new e(this.f13251b, 1);
            default:
                return new e(this.f13251b, 0);
        }
    }

    public final String toString() {
        switch (this.f13250a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f13251b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f13251b) + "')";
        }
    }
}

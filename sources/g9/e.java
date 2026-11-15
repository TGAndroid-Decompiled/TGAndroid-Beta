package g9;
public final class e extends d {
    public final int f12933a;
    public final char f12934b;

    public e(char c10, int i7) {
        this.f12933a = i7;
        this.f12934b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f12933a) {
            case 0:
                if (c10 == this.f12934b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f12934b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f12933a) {
            case 0:
                return new e(this.f12934b, 1);
            default:
                return new e(this.f12934b, 0);
        }
    }

    public final String toString() {
        switch (this.f12933a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f12934b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f12934b) + "')";
        }
    }
}

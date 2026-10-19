package d9;
public final class e extends d {
    public final int f7888a;
    public final char f7889b;

    public e(char c10, int i10) {
        this.f7888a = i10;
        this.f7889b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f7888a) {
            case 0:
                if (c10 == this.f7889b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f7889b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f7888a) {
            case 0:
                return new e(this.f7889b, 1);
            default:
                return new e(this.f7889b, 0);
        }
    }

    public final String toString() {
        switch (this.f7888a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f7889b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f7889b) + "')";
        }
    }
}

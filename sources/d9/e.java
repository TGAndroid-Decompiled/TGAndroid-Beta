package d9;
public final class e extends d {
    public final int f6433a;
    public final char f6434b;

    public e(char c10, int i10) {
        this.f6433a = i10;
        this.f6434b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f6433a) {
            case 0:
                if (c10 == this.f6434b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f6434b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f6433a) {
            case 0:
                return new e(this.f6434b, 1);
            default:
                return new e(this.f6434b, 0);
        }
    }

    public final String toString() {
        switch (this.f6433a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f6434b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f6434b) + "')";
        }
    }
}

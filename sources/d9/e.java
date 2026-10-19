package d9;
public final class e extends d {
    public final int f7886a;
    public final char f7887b;

    public e(char c10, int i10) {
        this.f7886a = i10;
        this.f7887b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f7886a) {
            case 0:
                if (c10 == this.f7887b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f7887b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f7886a) {
            case 0:
                return new e(this.f7887b, 1);
            default:
                return new e(this.f7887b, 0);
        }
    }

    public final String toString() {
        switch (this.f7886a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f7887b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f7887b) + "')";
        }
    }
}

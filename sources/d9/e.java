package d9;
public final class e extends d {
    public final int f6430a;
    public final char f6431b;

    public e(char c10, int i10) {
        this.f6430a = i10;
        this.f6431b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f6430a) {
            case 0:
                if (c10 == this.f6431b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f6431b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f6430a) {
            case 0:
                return new e(this.f6431b, 1);
            default:
                return new e(this.f6431b, 0);
        }
    }

    public final String toString() {
        switch (this.f6430a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f6431b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f6431b) + "')";
        }
    }
}

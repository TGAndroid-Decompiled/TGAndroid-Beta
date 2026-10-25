package e9;
public final class e extends d {
    public final int f9840a;
    public final char f9841b;

    public e(char c10, int i10) {
        this.f9840a = i10;
        this.f9841b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f9840a) {
            case 0:
                if (c10 == this.f9841b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f9841b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f9840a) {
            case 0:
                return new e(this.f9841b, 1);
            default:
                return new e(this.f9841b, 0);
        }
    }

    public final String toString() {
        switch (this.f9840a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f9841b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f9841b) + "')";
        }
    }
}

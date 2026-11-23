package g9;
public final class e extends d {
    public final int f13242a;
    public final char f13243b;

    public e(char c10, int i7) {
        this.f13242a = i7;
        this.f13243b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f13242a) {
            case 0:
                if (c10 == this.f13243b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f13243b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f13242a) {
            case 0:
                return new e(this.f13243b, 1);
            default:
                return new e(this.f13243b, 0);
        }
    }

    public final String toString() {
        switch (this.f13242a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f13243b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f13243b) + "')";
        }
    }
}

package d9;
public final class e extends d {
    public final int f5800a;
    public final char f5801b;

    public e(char c10, int i10) {
        this.f5800a = i10;
        this.f5801b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f5800a) {
            case 0:
                if (c10 == this.f5801b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f5801b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f5800a) {
            case 0:
                return new e(this.f5801b, 1);
            default:
                return new e(this.f5801b, 0);
        }
    }

    public final String toString() {
        switch (this.f5800a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f5801b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f5801b) + "')";
        }
    }
}

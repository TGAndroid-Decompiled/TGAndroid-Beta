package g9;
public final class e extends d {
    public final int f13247a;
    public final char f13248b;

    public e(char c10, int i7) {
        this.f13247a = i7;
        this.f13248b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f13247a) {
            case 0:
                if (c10 == this.f13248b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f13248b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f13247a) {
            case 0:
                return new e(this.f13248b, 1);
            default:
                return new e(this.f13248b, 0);
        }
    }

    public final String toString() {
        switch (this.f13247a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f13248b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f13248b) + "')";
        }
    }
}

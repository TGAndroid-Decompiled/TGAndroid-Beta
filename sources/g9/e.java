package g9;
public final class e extends d {
    public final int f13585a;
    public final char f13586b;

    public e(char c10, int i7) {
        this.f13585a = i7;
        this.f13586b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f13585a) {
            case 0:
                if (c10 == this.f13586b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f13586b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f13585a) {
            case 0:
                return new e(this.f13586b, 1);
            default:
                return new e(this.f13586b, 0);
        }
    }

    public final String toString() {
        switch (this.f13585a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f13586b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f13586b) + "')";
        }
    }
}

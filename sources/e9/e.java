package e9;
public final class e extends d {
    public final int f9839a;
    public final char f9840b;

    public e(char c10, int i10) {
        this.f9839a = i10;
        this.f9840b = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f9839a) {
            case 0:
                if (c10 == this.f9840b) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f9840b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final i d() {
        switch (this.f9839a) {
            case 0:
                return new e(this.f9840b, 1);
            default:
                return new e(this.f9840b, 0);
        }
    }

    public final String toString() {
        switch (this.f9839a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.f9840b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.f9840b) + "')";
        }
    }
}

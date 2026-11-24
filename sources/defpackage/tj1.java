package defpackage;
public final class tj1 extends sj1 {
    public final byte a;
    public final char b;

    public tj1(char c, byte b) {
        this.a = b;
        this.b = c;
    }

    @Override
    public final boolean b(char c) {
        switch (this.a) {
            case 0:
                if (c == this.b) {
                    return true;
                }
                return false;
            default:
                if (c != this.b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final wj1 c() {
        switch (this.a) {
            case 0:
                return new tj1(this.b, (byte) 1);
            default:
                return new tj1(this.b, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.a;
        char c = this.b;
        switch (b) {
            case 0:
                return "CharMatcher.is('" + wj1.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + wj1.d(c) + "')";
        }
    }
}

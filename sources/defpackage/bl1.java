package defpackage;
public final class bl1 extends al1 {
    public final byte a;
    public final char b;

    public bl1(char c, byte b) {
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
    public final el1 c() {
        switch (this.a) {
            case 0:
                return new bl1(this.b, (byte) 1);
            default:
                return new bl1(this.b, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.a;
        char c = this.b;
        switch (b) {
            case 0:
                return "CharMatcher.is('" + el1.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + el1.d(c) + "')";
        }
    }
}

package defpackage;
public final class lo5 implements gs3 {
    public final byte a;
    public String b;

    public lo5(String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    @Override
    public final int b(int i) {
        return -1;
    }

    @Override
    public final boolean c(int i) {
        return false;
    }

    @Override
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override
    public final int length() {
        return this.b.length();
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return this.b;
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }
}

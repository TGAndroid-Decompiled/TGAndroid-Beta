package defpackage;
public final class lg2 extends di2 {
    public final byte i = 1;

    public lg2(float f, float f2, int i) {
        super(f, f2, i);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return (int) ((this.b * 2.0f) + this.a);
            default:
                return hl.L(26.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return (int) ((this.b * 2.0f) + this.a);
            default:
                return hl.L(26.0f);
        }
    }

    public lg2(int i) {
        super(i);
    }
}

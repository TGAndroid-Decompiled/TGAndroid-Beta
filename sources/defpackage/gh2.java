package defpackage;
public final class gh2 extends wi2 {
    public final byte i = 1;

    public gh2(float f, float f2, int i) {
        super(f, f2, i);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return (int) ((this.b * 2.0f) + this.a);
            default:
                return gm.L(26.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return (int) ((this.b * 2.0f) + this.a);
            default:
                return gm.L(26.0f);
        }
    }

    public gh2(int i) {
        super(i);
    }
}

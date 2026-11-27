package defpackage;
public final class y53 extends s18 {
    public final byte c;
    public final float d;

    public y53(float f, byte b) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.c = b;
        switch (b) {
            case 1:
                super(2, Float.valueOf(Math.max(f, 0.0f)));
                this.d = Math.max(f, 0.0f);
                return;
            default:
                this.d = Math.max(f, 0.0f);
                return;
        }
    }

    @Override
    public final String toString() {
        byte b = this.c;
        float f = this.d;
        switch (b) {
            case 0:
                return "[Dash: length=" + f + "]";
            default:
                return "[Gap: length=" + f + "]";
        }
    }
}

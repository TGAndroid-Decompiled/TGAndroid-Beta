package j8;
public final class c extends h {
    public final int f12914c;
    public final float d;

    public c(float f7, int i10) {
        super(0, Float.valueOf(Math.max(f7, 0.0f)));
        this.f12914c = i10;
        switch (i10) {
            case 1:
                super(2, Float.valueOf(Math.max(f7, 0.0f)));
                this.d = Math.max(f7, 0.0f);
                return;
            default:
                this.d = Math.max(f7, 0.0f);
                return;
        }
    }

    @Override
    public final String toString() {
        switch (this.f12914c) {
            case 0:
                return "[Dash: length=" + this.d + "]";
            default:
                return "[Gap: length=" + this.d + "]";
        }
    }
}

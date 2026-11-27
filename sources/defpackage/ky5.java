package defpackage;
public final class ky5 implements fx7 {
    public final byte a;
    public final Object b;
    public final float c;

    public ky5(Object obj, float f, byte b) {
        this.a = b;
        this.b = obj;
        this.c = f;
    }

    @Override
    public final void G(float f) {
        byte b = this.a;
        float f2 = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                rlb rlbVar = (rlb) obj;
                rlbVar.B0 = true;
                rlbVar.setBaseFontSize((int) (f2 * f));
                return;
            default:
                rlb rlbVar2 = (rlb) obj;
                rlbVar2.B0 = true;
                rlbVar2.setBaseFontSize((int) (f2 * f));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f;
        switch (this.a) {
            case 0:
                baseFontSize = ((rlb) this.b).getBaseFontSize();
                f = this.c;
                break;
            default:
                baseFontSize = ((rlb) this.b).getBaseFontSize();
                f = this.c;
                break;
        }
        return baseFontSize / f;
    }
}

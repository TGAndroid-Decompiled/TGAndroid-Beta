package dg;
public final class j0 implements s2 {
    public final int f4600a;
    public final b4 f4601b;
    public final float f4602c;

    public j0(b4 b4Var, float f10, int i10) {
        this.f4600a = i10;
        this.f4601b = b4Var;
        this.f4602c = f10;
    }

    @Override
    public final void F(float f10) {
        switch (this.f4600a) {
            case 0:
                b4 b4Var = this.f4601b;
                b4Var.f4415w0 = true;
                b4Var.setBaseFontSize((int) (this.f4602c * f10));
                return;
            default:
                b4 b4Var2 = this.f4601b;
                b4Var2.f4415w0 = true;
                b4Var2.setBaseFontSize((int) (this.f4602c * f10));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.f4600a) {
            case 0:
                baseFontSize = this.f4601b.getBaseFontSize();
                f10 = this.f4602c;
                break;
            default:
                baseFontSize = this.f4601b.getBaseFontSize();
                f10 = this.f4602c;
                break;
        }
        return baseFontSize / f10;
    }
}

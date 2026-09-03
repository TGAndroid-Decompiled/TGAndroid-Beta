package dg;
public final class j0 implements s2 {
    public final int f4606a;
    public final b4 f4607b;
    public final float f4608c;

    public j0(b4 b4Var, float f10, int i10) {
        this.f4606a = i10;
        this.f4607b = b4Var;
        this.f4608c = f10;
    }

    @Override
    public final void A(float f10) {
        switch (this.f4606a) {
            case 0:
                b4 b4Var = this.f4607b;
                b4Var.f4421w0 = true;
                b4Var.setBaseFontSize((int) (this.f4608c * f10));
                return;
            default:
                b4 b4Var2 = this.f4607b;
                b4Var2.f4421w0 = true;
                b4Var2.setBaseFontSize((int) (this.f4608c * f10));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.f4606a) {
            case 0:
                baseFontSize = this.f4607b.getBaseFontSize();
                f10 = this.f4608c;
                break;
            default:
                baseFontSize = this.f4607b.getBaseFontSize();
                f10 = this.f4608c;
                break;
        }
        return baseFontSize / f10;
    }
}

package eg;
public final class h0 implements q2 {
    public final int f5228a;
    public final z3 f5229b;
    public final float f5230c;

    public h0(z3 z3Var, float f10, int i10) {
        this.f5228a = i10;
        this.f5229b = z3Var;
        this.f5230c = f10;
    }

    @Override
    public final void H(float f10) {
        switch (this.f5228a) {
            case 0:
                z3 z3Var = this.f5229b;
                z3Var.f5608w0 = true;
                z3Var.setBaseFontSize((int) (this.f5230c * f10));
                return;
            default:
                z3 z3Var2 = this.f5229b;
                z3Var2.f5608w0 = true;
                z3Var2.setBaseFontSize((int) (this.f5230c * f10));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.f5228a) {
            case 0:
                baseFontSize = this.f5229b.getBaseFontSize();
                f10 = this.f5230c;
                break;
            default:
                baseFontSize = this.f5229b.getBaseFontSize();
                f10 = this.f5230c;
                break;
        }
        return baseFontSize / f10;
    }
}

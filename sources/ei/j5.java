package ei;
public final class j5 implements rg.w1 {
    public final int f9256a;
    public final rg.w2 f9257b;
    public final float f9258c;

    public j5(rg.w2 w2Var, float f7, int i10) {
        this.f9256a = i10;
        this.f9257b = w2Var;
        this.f9258c = f7;
    }

    @Override
    public final void U(float f7) {
        switch (this.f9256a) {
            case 0:
                rg.w2 w2Var = this.f9257b;
                w2Var.f46120z0 = true;
                w2Var.setBaseFontSize((int) (this.f9258c * f7));
                return;
            default:
                rg.w2 w2Var2 = this.f9257b;
                w2Var2.f46120z0 = true;
                w2Var2.setBaseFontSize((int) (this.f9258c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f9256a) {
            case 0:
                baseFontSize = this.f9257b.getBaseFontSize();
                f7 = this.f9258c;
                break;
            default:
                baseFontSize = this.f9257b.getBaseFontSize();
                f7 = this.f9258c;
                break;
        }
        return baseFontSize / f7;
    }
}

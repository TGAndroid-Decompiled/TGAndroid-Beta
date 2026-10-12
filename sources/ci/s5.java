package ci;
public final class s5 implements qg.v1 {
    public final int f5950a;
    public final qg.w2 f5951b;
    public final float f5952c;

    public s5(qg.w2 w2Var, float f7, int i10) {
        this.f5950a = i10;
        this.f5951b = w2Var;
        this.f5952c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5950a) {
            case 0:
                baseFontSize = this.f5951b.getBaseFontSize();
                f7 = this.f5952c;
                break;
            default:
                baseFontSize = this.f5951b.getBaseFontSize();
                f7 = this.f5952c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void l0(float f7) {
        switch (this.f5950a) {
            case 0:
                qg.w2 w2Var = this.f5951b;
                w2Var.f46555z0 = true;
                w2Var.setBaseFontSize((int) (this.f5952c * f7));
                return;
            default:
                qg.w2 w2Var2 = this.f5951b;
                w2Var2.f46555z0 = true;
                w2Var2.setBaseFontSize((int) (this.f5952c * f7));
                return;
        }
    }
}

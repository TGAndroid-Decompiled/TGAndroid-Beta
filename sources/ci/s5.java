package ci;
public final class s5 implements qg.v1 {
    public final int f5952a;
    public final qg.w2 f5953b;
    public final float f5954c;

    public s5(qg.w2 w2Var, float f7, int i10) {
        this.f5952a = i10;
        this.f5953b = w2Var;
        this.f5954c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5952a) {
            case 0:
                baseFontSize = this.f5953b.getBaseFontSize();
                f7 = this.f5954c;
                break;
            default:
                baseFontSize = this.f5953b.getBaseFontSize();
                f7 = this.f5954c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void q0(float f7) {
        switch (this.f5952a) {
            case 0:
                qg.w2 w2Var = this.f5953b;
                w2Var.f46616z0 = true;
                w2Var.setBaseFontSize((int) (this.f5954c * f7));
                return;
            default:
                qg.w2 w2Var2 = this.f5953b;
                w2Var2.f46616z0 = true;
                w2Var2.setBaseFontSize((int) (this.f5954c * f7));
                return;
        }
    }
}

package ci;
public final class t5 implements qg.w1 {
    public final int f5544a;
    public final qg.v2 f5545b;
    public final float f5546c;

    public t5(qg.v2 v2Var, float f7, int i10) {
        this.f5544a = i10;
        this.f5545b = v2Var;
        this.f5546c = f7;
    }

    @Override
    public final void K(float f7) {
        switch (this.f5544a) {
            case 0:
                qg.v2 v2Var = this.f5545b;
                v2Var.f41973z0 = true;
                v2Var.setBaseFontSize((int) (this.f5546c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5545b;
                v2Var2.f41973z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5546c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5544a) {
            case 0:
                baseFontSize = this.f5545b.getBaseFontSize();
                f7 = this.f5546c;
                break;
            default:
                baseFontSize = this.f5545b.getBaseFontSize();
                f7 = this.f5546c;
                break;
        }
        return baseFontSize / f7;
    }
}

package ci;
public final class t5 implements qg.v1 {
    public final int f5551a;
    public final qg.v2 f5552b;
    public final float f5553c;

    public t5(qg.v2 v2Var, float f7, int i10) {
        this.f5551a = i10;
        this.f5552b = v2Var;
        this.f5553c = f7;
    }

    @Override
    public final void Z(float f7) {
        switch (this.f5551a) {
            case 0:
                qg.v2 v2Var = this.f5552b;
                v2Var.f42003z0 = true;
                v2Var.setBaseFontSize((int) (this.f5553c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5552b;
                v2Var2.f42003z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5553c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5551a) {
            case 0:
                baseFontSize = this.f5552b.getBaseFontSize();
                f7 = this.f5553c;
                break;
            default:
                baseFontSize = this.f5552b.getBaseFontSize();
                f7 = this.f5553c;
                break;
        }
        return baseFontSize / f7;
    }
}

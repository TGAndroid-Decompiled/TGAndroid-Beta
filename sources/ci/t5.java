package ci;
public final class t5 implements qg.w1 {
    public final int f5553a;
    public final qg.v2 f5554b;
    public final float f5555c;

    public t5(qg.v2 v2Var, float f7, int i10) {
        this.f5553a = i10;
        this.f5554b = v2Var;
        this.f5555c = f7;
    }

    @Override
    public final void K(float f7) {
        switch (this.f5553a) {
            case 0:
                qg.v2 v2Var = this.f5554b;
                v2Var.f42075z0 = true;
                v2Var.setBaseFontSize((int) (this.f5555c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5554b;
                v2Var2.f42075z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5555c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5553a) {
            case 0:
                baseFontSize = this.f5554b.getBaseFontSize();
                f7 = this.f5555c;
                break;
            default:
                baseFontSize = this.f5554b.getBaseFontSize();
                f7 = this.f5555c;
                break;
        }
        return baseFontSize / f7;
    }
}

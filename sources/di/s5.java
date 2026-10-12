package di;
public final class s5 implements rg.x1 {
    public final int f7762a;
    public final rg.x2 f7763b;
    public final float f7764c;

    public s5(rg.x2 x2Var, float f7, int i10) {
        this.f7762a = i10;
        this.f7763b = x2Var;
        this.f7764c = f7;
    }

    @Override
    public final void B0(float f7) {
        switch (this.f7762a) {
            case 0:
                rg.x2 x2Var = this.f7763b;
                x2Var.f44604z0 = true;
                x2Var.setBaseFontSize((int) (this.f7764c * f7));
                return;
            default:
                rg.x2 x2Var2 = this.f7763b;
                x2Var2.f44604z0 = true;
                x2Var2.setBaseFontSize((int) (this.f7764c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f7762a) {
            case 0:
                baseFontSize = this.f7763b.getBaseFontSize();
                f7 = this.f7764c;
                break;
            default:
                baseFontSize = this.f7763b.getBaseFontSize();
                f7 = this.f7764c;
                break;
        }
        return baseFontSize / f7;
    }
}

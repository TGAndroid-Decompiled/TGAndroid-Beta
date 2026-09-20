package ci;
public final class u5 implements qg.w1 {
    public final int f5621a;
    public final qg.v2 f5622b;
    public final float f5623c;

    public u5(qg.v2 v2Var, float f7, int i10) {
        this.f5621a = i10;
        this.f5622b = v2Var;
        this.f5623c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5621a) {
            case 0:
                baseFontSize = this.f5622b.getBaseFontSize();
                f7 = this.f5623c;
                break;
            default:
                baseFontSize = this.f5622b.getBaseFontSize();
                f7 = this.f5623c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void y(float f7) {
        switch (this.f5621a) {
            case 0:
                qg.v2 v2Var = this.f5622b;
                v2Var.f41986z0 = true;
                v2Var.setBaseFontSize((int) (this.f5623c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5622b;
                v2Var2.f41986z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5623c * f7));
                return;
        }
    }
}

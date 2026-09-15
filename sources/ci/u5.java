package ci;
public final class u5 implements qg.y1 {
    public final int f5615a;
    public final qg.x2 f5616b;
    public final float f5617c;

    public u5(qg.x2 x2Var, float f7, int i10) {
        this.f5615a = i10;
        this.f5616b = x2Var;
        this.f5617c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5615a) {
            case 0:
                baseFontSize = this.f5616b.getBaseFontSize();
                f7 = this.f5617c;
                break;
            default:
                baseFontSize = this.f5616b.getBaseFontSize();
                f7 = this.f5617c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void l(float f7) {
        switch (this.f5615a) {
            case 0:
                qg.x2 x2Var = this.f5616b;
                x2Var.f41715z0 = true;
                x2Var.setBaseFontSize((int) (this.f5617c * f7));
                return;
            default:
                qg.x2 x2Var2 = this.f5616b;
                x2Var2.f41715z0 = true;
                x2Var2.setBaseFontSize((int) (this.f5617c * f7));
                return;
        }
    }
}

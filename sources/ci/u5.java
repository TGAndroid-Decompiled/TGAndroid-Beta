package ci;
public final class u5 implements qg.w1 {
    public final int f5619a;
    public final qg.v2 f5620b;
    public final float f5621c;

    public u5(qg.v2 v2Var, float f7, int i10) {
        this.f5619a = i10;
        this.f5620b = v2Var;
        this.f5621c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5619a) {
            case 0:
                baseFontSize = this.f5620b.getBaseFontSize();
                f7 = this.f5621c;
                break;
            default:
                baseFontSize = this.f5620b.getBaseFontSize();
                f7 = this.f5621c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void m(float f7) {
        switch (this.f5619a) {
            case 0:
                qg.v2 v2Var = this.f5620b;
                v2Var.f42007z0 = true;
                v2Var.setBaseFontSize((int) (this.f5621c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5620b;
                v2Var2.f42007z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5621c * f7));
                return;
        }
    }
}

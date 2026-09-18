package ci;
public final class u5 implements qg.v1 {
    public final int f5620a;
    public final qg.u2 f5621b;
    public final float f5622c;

    public u5(qg.u2 u2Var, float f7, int i10) {
        this.f5620a = i10;
        this.f5621b = u2Var;
        this.f5622c = f7;
    }

    @Override
    public final void K(float f7) {
        switch (this.f5620a) {
            case 0:
                qg.u2 u2Var = this.f5621b;
                u2Var.f41938z0 = true;
                u2Var.setBaseFontSize((int) (this.f5622c * f7));
                return;
            default:
                qg.u2 u2Var2 = this.f5621b;
                u2Var2.f41938z0 = true;
                u2Var2.setBaseFontSize((int) (this.f5622c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5620a) {
            case 0:
                baseFontSize = this.f5621b.getBaseFontSize();
                f7 = this.f5622c;
                break;
            default:
                baseFontSize = this.f5621b.getBaseFontSize();
                f7 = this.f5622c;
                break;
        }
        return baseFontSize / f7;
    }
}

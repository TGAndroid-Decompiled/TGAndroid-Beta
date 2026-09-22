package ci;
public final class u5 implements qg.y1 {
    public final int f5617a;
    public final qg.x2 f5618b;
    public final float f5619c;

    public u5(qg.x2 x2Var, float f7, int i10) {
        this.f5617a = i10;
        this.f5618b = x2Var;
        this.f5619c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5617a) {
            case 0:
                baseFontSize = this.f5618b.getBaseFontSize();
                f7 = this.f5619c;
                break;
            default:
                baseFontSize = this.f5618b.getBaseFontSize();
                f7 = this.f5619c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void l(float f7) {
        switch (this.f5617a) {
            case 0:
                qg.x2 x2Var = this.f5618b;
                x2Var.f41711z0 = true;
                x2Var.setBaseFontSize((int) (this.f5619c * f7));
                return;
            default:
                qg.x2 x2Var2 = this.f5618b;
                x2Var2.f41711z0 = true;
                x2Var2.setBaseFontSize((int) (this.f5619c * f7));
                return;
        }
    }
}

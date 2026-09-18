package ci;
public final class u5 implements qg.y1 {
    public final int f5620a;
    public final qg.x2 f5621b;
    public final float f5622c;

    public u5(qg.x2 x2Var, float f7, int i10) {
        this.f5620a = i10;
        this.f5621b = x2Var;
        this.f5622c = f7;
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

    @Override
    public final void l(float f7) {
        switch (this.f5620a) {
            case 0:
                qg.x2 x2Var = this.f5621b;
                x2Var.f41742z0 = true;
                x2Var.setBaseFontSize((int) (this.f5622c * f7));
                return;
            default:
                qg.x2 x2Var2 = this.f5621b;
                x2Var2.f41742z0 = true;
                x2Var2.setBaseFontSize((int) (this.f5622c * f7));
                return;
        }
    }
}

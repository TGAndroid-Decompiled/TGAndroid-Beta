package di;
public final class s5 implements rg.x1 {
    public final int f7765a;
    public final rg.x2 f7766b;
    public final float f7767c;

    public s5(rg.x2 x2Var, float f7, int i10) {
        this.f7765a = i10;
        this.f7766b = x2Var;
        this.f7767c = f7;
    }

    @Override
    public final void G0(float f7) {
        switch (this.f7765a) {
            case 0:
                rg.x2 x2Var = this.f7766b;
                x2Var.f44363z0 = true;
                x2Var.setBaseFontSize((int) (this.f7767c * f7));
                return;
            default:
                rg.x2 x2Var2 = this.f7766b;
                x2Var2.f44363z0 = true;
                x2Var2.setBaseFontSize((int) (this.f7767c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f7765a) {
            case 0:
                baseFontSize = this.f7766b.getBaseFontSize();
                f7 = this.f7767c;
                break;
            default:
                baseFontSize = this.f7766b.getBaseFontSize();
                f7 = this.f7767c;
                break;
        }
        return baseFontSize / f7;
    }
}

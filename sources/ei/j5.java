package ei;
public final class j5 implements rg.v1 {
    public final int f9245a;
    public final rg.v2 f9246b;
    public final float f9247c;

    public j5(rg.v2 v2Var, float f7, int i10) {
        this.f9245a = i10;
        this.f9246b = v2Var;
        this.f9247c = f7;
    }

    @Override
    public final void U(float f7) {
        switch (this.f9245a) {
            case 0:
                rg.v2 v2Var = this.f9246b;
                v2Var.f45681z0 = true;
                v2Var.setBaseFontSize((int) (this.f9247c * f7));
                return;
            default:
                rg.v2 v2Var2 = this.f9246b;
                v2Var2.f45681z0 = true;
                v2Var2.setBaseFontSize((int) (this.f9247c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f9245a) {
            case 0:
                baseFontSize = this.f9246b.getBaseFontSize();
                f7 = this.f9247c;
                break;
            default:
                baseFontSize = this.f9246b.getBaseFontSize();
                f7 = this.f9247c;
                break;
        }
        return baseFontSize / f7;
    }
}

package ei;
public final class j5 implements rg.v1 {
    public final int f9246a;
    public final rg.u2 f9247b;
    public final float f9248c;

    public j5(rg.u2 u2Var, float f7, int i10) {
        this.f9246a = i10;
        this.f9247b = u2Var;
        this.f9248c = f7;
    }

    @Override
    public final void U(float f7) {
        switch (this.f9246a) {
            case 0:
                rg.u2 u2Var = this.f9247b;
                u2Var.f45667z0 = true;
                u2Var.setBaseFontSize((int) (this.f9248c * f7));
                return;
            default:
                rg.u2 u2Var2 = this.f9247b;
                u2Var2.f45667z0 = true;
                u2Var2.setBaseFontSize((int) (this.f9248c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f9246a) {
            case 0:
                baseFontSize = this.f9247b.getBaseFontSize();
                f7 = this.f9248c;
                break;
            default:
                baseFontSize = this.f9247b.getBaseFontSize();
                f7 = this.f9248c;
                break;
        }
        return baseFontSize / f7;
    }
}

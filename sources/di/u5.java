package di;
public final class u5 implements rg.x1 {
    public final int f8272a;
    public final rg.x2 f8273b;
    public final float f8274c;

    public u5(rg.x2 x2Var, float f7, int i10) {
        this.f8272a = i10;
        this.f8273b = x2Var;
        this.f8274c = f7;
    }

    @Override
    public final void H(float f7) {
        switch (this.f8272a) {
            case 0:
                rg.x2 x2Var = this.f8273b;
                x2Var.f45579z0 = true;
                x2Var.setBaseFontSize((int) (this.f8274c * f7));
                return;
            default:
                rg.x2 x2Var2 = this.f8273b;
                x2Var2.f45579z0 = true;
                x2Var2.setBaseFontSize((int) (this.f8274c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f8272a) {
            case 0:
                baseFontSize = this.f8273b.getBaseFontSize();
                f7 = this.f8274c;
                break;
            default:
                baseFontSize = this.f8273b.getBaseFontSize();
                f7 = this.f8274c;
                break;
        }
        return baseFontSize / f7;
    }
}

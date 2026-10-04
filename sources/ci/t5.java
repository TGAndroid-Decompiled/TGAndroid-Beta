package ci;
public final class t5 implements qg.v1 {
    public final int f5973a;
    public final qg.v2 f5974b;
    public final float f5975c;

    public t5(qg.v2 v2Var, float f7, int i10) {
        this.f5973a = i10;
        this.f5974b = v2Var;
        this.f5975c = f7;
    }

    @Override
    public final void E(float f7) {
        switch (this.f5973a) {
            case 0:
                qg.v2 v2Var = this.f5974b;
                v2Var.f45374z0 = true;
                v2Var.setBaseFontSize((int) (this.f5975c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5974b;
                v2Var2.f45374z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5975c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5973a) {
            case 0:
                baseFontSize = this.f5974b.getBaseFontSize();
                f7 = this.f5975c;
                break;
            default:
                baseFontSize = this.f5974b.getBaseFontSize();
                f7 = this.f5975c;
                break;
        }
        return baseFontSize / f7;
    }
}

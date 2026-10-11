package ci;
public final class s5 implements qg.v1 {
    public final int f5951a;
    public final qg.v2 f5952b;
    public final float f5953c;

    public s5(qg.v2 v2Var, float f7, int i10) {
        this.f5951a = i10;
        this.f5952b = v2Var;
        this.f5953c = f7;
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f5951a) {
            case 0:
                baseFontSize = this.f5952b.getBaseFontSize();
                f7 = this.f5953c;
                break;
            default:
                baseFontSize = this.f5952b.getBaseFontSize();
                f7 = this.f5953c;
                break;
        }
        return baseFontSize / f7;
    }

    @Override
    public final void q0(float f7) {
        switch (this.f5951a) {
            case 0:
                qg.v2 v2Var = this.f5952b;
                v2Var.f46706z0 = true;
                v2Var.setBaseFontSize((int) (this.f5953c * f7));
                return;
            default:
                qg.v2 v2Var2 = this.f5952b;
                v2Var2.f46706z0 = true;
                v2Var2.setBaseFontSize((int) (this.f5953c * f7));
                return;
        }
    }
}

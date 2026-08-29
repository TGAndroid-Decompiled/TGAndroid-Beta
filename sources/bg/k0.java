package bg;
public final class k0 implements v2 {
    public final int f2365a;
    public final f4 f2366b;
    public final float f2367c;

    public k0(f4 f4Var, float f9, int i10) {
        this.f2365a = i10;
        this.f2366b = f4Var;
        this.f2367c = f9;
    }

    @Override
    public final void K(float f9) {
        switch (this.f2365a) {
            case 0:
                f4 f4Var = this.f2366b;
                f4Var.f2218v0 = true;
                f4Var.setBaseFontSize((int) (this.f2367c * f9));
                return;
            default:
                f4 f4Var2 = this.f2366b;
                f4Var2.f2218v0 = true;
                f4Var2.setBaseFontSize((int) (this.f2367c * f9));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f9;
        switch (this.f2365a) {
            case 0:
                baseFontSize = this.f2366b.getBaseFontSize();
                f9 = this.f2367c;
                break;
            default:
                baseFontSize = this.f2366b.getBaseFontSize();
                f9 = this.f2367c;
                break;
        }
        return baseFontSize / f9;
    }
}

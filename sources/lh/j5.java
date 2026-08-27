package lh;

public final class j5 implements zf.v1 {

    public final int f16185a;

    public final zf.v2 f16186b;

    public final float f16187c;

    public j5(zf.v2 v2Var, float f10, int i10) {
        this.f16185a = i10;
        this.f16186b = v2Var;
        this.f16187c = f10;
    }

    @Override
    public final void c0(float f10) {
        switch (this.f16185a) {
            case 0:
                zf.v2 v2Var = this.f16186b;
                v2Var.f50742v0 = true;
                v2Var.setBaseFontSize((int) (this.f16187c * f10));
                break;
            default:
                zf.v2 v2Var2 = this.f16186b;
                v2Var2.f50742v0 = true;
                v2Var2.setBaseFontSize((int) (this.f16187c * f10));
                break;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.f16185a) {
            case 0:
                baseFontSize = this.f16186b.getBaseFontSize();
                f10 = this.f16187c;
                break;
            default:
                baseFontSize = this.f16186b.getBaseFontSize();
                f10 = this.f16187c;
                break;
        }
        return baseFontSize / f10;
    }
}

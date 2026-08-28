package kh;
public final class k5 implements yf.v1 {
    public final int f15517a;
    public final yf.v2 f15518b;
    public final float f15519c;

    public k5(yf.v2 v2Var, float f10, int i9) {
        this.f15517a = i9;
        this.f15518b = v2Var;
        this.f15519c = f10;
    }

    @Override
    public final void g0(float f10) {
        switch (this.f15517a) {
            case 0:
                yf.v2 v2Var = this.f15518b;
                v2Var.f50147v0 = true;
                v2Var.setBaseFontSize((int) (this.f15519c * f10));
                return;
            default:
                yf.v2 v2Var2 = this.f15518b;
                v2Var2.f50147v0 = true;
                v2Var2.setBaseFontSize((int) (this.f15519c * f10));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.f15517a) {
            case 0:
                baseFontSize = this.f15518b.getBaseFontSize();
                f10 = this.f15519c;
                break;
            default:
                baseFontSize = this.f15518b.getBaseFontSize();
                f10 = this.f15519c;
                break;
        }
        return baseFontSize / f10;
    }
}

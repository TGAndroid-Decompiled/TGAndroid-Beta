package hi;
public final class u4 implements tg.m1 {
    public final int f15538a;
    public final Object f15539b;
    public final float f15540c;

    public u4(Object obj, float f10, int i7) {
        this.f15538a = i7;
        this.f15539b = obj;
        this.f15540c = f10;
    }

    @Override
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.f15538a) {
            case 0:
                baseFontSize = ((tg.n2) this.f15539b).getBaseFontSize();
                f10 = this.f15540c;
                break;
            default:
                baseFontSize = ((tg.n2) this.f15539b).getBaseFontSize();
                f10 = this.f15540c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override
    public void y1(float f10) {
        switch (this.f15538a) {
            case 0:
                tg.n2 n2Var = (tg.n2) this.f15539b;
                n2Var.A0 = true;
                n2Var.setBaseFontSize((int) (this.f15540c * f10));
                return;
            default:
                tg.n2 n2Var2 = (tg.n2) this.f15539b;
                n2Var2.A0 = true;
                n2Var2.setBaseFontSize((int) (this.f15540c * f10));
                return;
        }
    }
}

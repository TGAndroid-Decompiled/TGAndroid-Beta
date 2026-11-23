package hi;
public final class g5 implements tg.q1 {
    public final int f14539a;
    public final Object f14540b;
    public final float f14541c;

    public g5(Object obj, float f10, int i7) {
        this.f14539a = i7;
        this.f14540b = obj;
        this.f14541c = f10;
    }

    @Override
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.f14539a) {
            case 0:
                baseFontSize = ((tg.q2) this.f14540b).getBaseFontSize();
                f10 = this.f14541c;
                break;
            default:
                baseFontSize = ((tg.q2) this.f14540b).getBaseFontSize();
                f10 = this.f14541c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override
    public void h2(float f10) {
        switch (this.f14539a) {
            case 0:
                tg.q2 q2Var = (tg.q2) this.f14540b;
                q2Var.B0 = true;
                q2Var.setBaseFontSize((int) (this.f14541c * f10));
                return;
            default:
                tg.q2 q2Var2 = (tg.q2) this.f14540b;
                q2Var2.B0 = true;
                q2Var2.setBaseFontSize((int) (this.f14541c * f10));
                return;
        }
    }
}

package gi;
public final class w4 implements ug.k1 {
    public final int f13794a;
    public final Object f13795b;
    public final float f13796c;

    public w4(Object obj, float f10, int i3) {
        this.f13794a = i3;
        this.f13795b = obj;
        this.f13796c = f10;
    }

    @Override
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.f13794a) {
            case 0:
                baseFontSize = ((ug.l2) this.f13795b).getBaseFontSize();
                f10 = this.f13796c;
                break;
            default:
                baseFontSize = ((ug.l2) this.f13795b).getBaseFontSize();
                f10 = this.f13796c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override
    public void s(float f10) {
        switch (this.f13794a) {
            case 0:
                ug.l2 l2Var = (ug.l2) this.f13795b;
                l2Var.A0 = true;
                l2Var.setBaseFontSize((int) (this.f13796c * f10));
                return;
            default:
                ug.l2 l2Var2 = (ug.l2) this.f13795b;
                l2Var2.A0 = true;
                l2Var2.setBaseFontSize((int) (this.f13796c * f10));
                return;
        }
    }
}

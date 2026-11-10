package fi;
public final class y4 implements tg.l1 {
    public final int f13161a;
    public final Object f13162b;
    public final float f13163c;

    public y4(Object obj, float f10, int i7) {
        this.f13161a = i7;
        this.f13162b = obj;
        this.f13163c = f10;
    }

    @Override
    public void X(float f10) {
        switch (this.f13161a) {
            case 0:
                tg.k2 k2Var = (tg.k2) this.f13162b;
                k2Var.f55828z0 = true;
                k2Var.setBaseFontSize((int) (this.f13163c * f10));
                return;
            default:
                tg.k2 k2Var2 = (tg.k2) this.f13162b;
                k2Var2.f55828z0 = true;
                k2Var2.setBaseFontSize((int) (this.f13163c * f10));
                return;
        }
    }

    @Override
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.f13161a) {
            case 0:
                baseFontSize = ((tg.k2) this.f13162b).getBaseFontSize();
                f10 = this.f13163c;
                break;
            default:
                baseFontSize = ((tg.k2) this.f13162b).getBaseFontSize();
                f10 = this.f13163c;
                break;
        }
        return baseFontSize / f10;
    }
}

package fi;
public final class y4 implements tg.l1 {
    public final int f13159a;
    public final Object f13160b;
    public final float f13161c;

    public y4(Object obj, float f10, int i7) {
        this.f13159a = i7;
        this.f13160b = obj;
        this.f13161c = f10;
    }

    @Override
    public void X(float f10) {
        switch (this.f13159a) {
            case 0:
                tg.k2 k2Var = (tg.k2) this.f13160b;
                k2Var.f55817z0 = true;
                k2Var.setBaseFontSize((int) (this.f13161c * f10));
                return;
            default:
                tg.k2 k2Var2 = (tg.k2) this.f13160b;
                k2Var2.f55817z0 = true;
                k2Var2.setBaseFontSize((int) (this.f13161c * f10));
                return;
        }
    }

    @Override
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.f13159a) {
            case 0:
                baseFontSize = ((tg.k2) this.f13160b).getBaseFontSize();
                f10 = this.f13161c;
                break;
            default:
                baseFontSize = ((tg.k2) this.f13160b).getBaseFontSize();
                f10 = this.f13161c;
                break;
        }
        return baseFontSize / f10;
    }
}

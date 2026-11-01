package jg;
public final class c0 implements c2 {
    public final int f9902a;
    public final Object f9903b;
    public final float f9904c;

    public c0(Object obj, float f7, int i10) {
        this.f9902a = i10;
        this.f9903b = obj;
        this.f9904c = f7;
    }

    @Override
    public void G(float f7) {
        switch (this.f9902a) {
            case 0:
                g3 g3Var = (g3) this.f9903b;
                g3Var.f9993z0 = true;
                g3Var.setBaseFontSize((int) (this.f9904c * f7));
                return;
            default:
                g3 g3Var2 = (g3) this.f9903b;
                g3Var2.f9993z0 = true;
                g3Var2.setBaseFontSize((int) (this.f9904c * f7));
                return;
        }
    }

    @Override
    public float get() {
        float baseFontSize;
        float f7;
        switch (this.f9902a) {
            case 0:
                baseFontSize = ((g3) this.f9903b).getBaseFontSize();
                f7 = this.f9904c;
                break;
            default:
                baseFontSize = ((g3) this.f9903b).getBaseFontSize();
                f7 = this.f9904c;
                break;
        }
        return baseFontSize / f7;
    }
}

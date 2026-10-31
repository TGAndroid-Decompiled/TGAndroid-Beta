package jg;
public final class c0 implements c2 {
    public final int f9901a;
    public final Object f9902b;
    public final float f9903c;

    public c0(Object obj, float f7, int i10) {
        this.f9901a = i10;
        this.f9902b = obj;
        this.f9903c = f7;
    }

    @Override
    public void G(float f7) {
        switch (this.f9901a) {
            case 0:
                g3 g3Var = (g3) this.f9902b;
                g3Var.f9992z0 = true;
                g3Var.setBaseFontSize((int) (this.f9903c * f7));
                return;
            default:
                g3 g3Var2 = (g3) this.f9902b;
                g3Var2.f9992z0 = true;
                g3Var2.setBaseFontSize((int) (this.f9903c * f7));
                return;
        }
    }

    @Override
    public float get() {
        float baseFontSize;
        float f7;
        switch (this.f9901a) {
            case 0:
                baseFontSize = ((g3) this.f9902b).getBaseFontSize();
                f7 = this.f9903c;
                break;
            default:
                baseFontSize = ((g3) this.f9902b).getBaseFontSize();
                f7 = this.f9903c;
                break;
        }
        return baseFontSize / f7;
    }
}

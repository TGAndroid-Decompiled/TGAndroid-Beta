package fi;
public final class i5 implements sg.x1 {
    public final int f10994a;
    public final sg.x2 f10995b;
    public final float f10996c;

    public i5(sg.x2 x2Var, float f7, int i10) {
        this.f10994a = i10;
        this.f10995b = x2Var;
        this.f10996c = f7;
    }

    @Override
    public final void V(float f7) {
        switch (this.f10994a) {
            case 0:
                sg.x2 x2Var = this.f10995b;
                x2Var.f48569z0 = true;
                x2Var.setBaseFontSize((int) (this.f10996c * f7));
                return;
            default:
                sg.x2 x2Var2 = this.f10995b;
                x2Var2.f48569z0 = true;
                x2Var2.setBaseFontSize((int) (this.f10996c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f10994a) {
            case 0:
                baseFontSize = this.f10995b.getBaseFontSize();
                f7 = this.f10996c;
                break;
            default:
                baseFontSize = this.f10995b.getBaseFontSize();
                f7 = this.f10996c;
                break;
        }
        return baseFontSize / f7;
    }
}

package fi;
public final class i5 implements sg.w1 {
    public final int f10993a;
    public final sg.w2 f10994b;
    public final float f10995c;

    public i5(sg.w2 w2Var, float f7, int i10) {
        this.f10993a = i10;
        this.f10994b = w2Var;
        this.f10995c = f7;
    }

    @Override
    public final void V(float f7) {
        switch (this.f10993a) {
            case 0:
                sg.w2 w2Var = this.f10994b;
                w2Var.f48597z0 = true;
                w2Var.setBaseFontSize((int) (this.f10995c * f7));
                return;
            default:
                sg.w2 w2Var2 = this.f10994b;
                w2Var2.f48597z0 = true;
                w2Var2.setBaseFontSize((int) (this.f10995c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f10993a) {
            case 0:
                baseFontSize = this.f10994b.getBaseFontSize();
                f7 = this.f10995c;
                break;
            default:
                baseFontSize = this.f10994b.getBaseFontSize();
                f7 = this.f10995c;
                break;
        }
        return baseFontSize / f7;
    }
}

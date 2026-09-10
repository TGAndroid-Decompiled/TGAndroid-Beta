package bi;
public final class s6 implements pg.v1 {
    public final int f3647a;
    public final pg.v2 f3648b;
    public final float f3649c;

    public s6(pg.v2 v2Var, float f7, int i10) {
        this.f3647a = i10;
        this.f3648b = v2Var;
        this.f3649c = f7;
    }

    @Override
    public final void V(float f7) {
        switch (this.f3647a) {
            case 0:
                pg.v2 v2Var = this.f3648b;
                v2Var.f40331z0 = true;
                v2Var.setBaseFontSize((int) (this.f3649c * f7));
                return;
            default:
                pg.v2 v2Var2 = this.f3648b;
                v2Var2.f40331z0 = true;
                v2Var2.setBaseFontSize((int) (this.f3649c * f7));
                return;
        }
    }

    @Override
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.f3647a) {
            case 0:
                baseFontSize = this.f3648b.getBaseFontSize();
                f7 = this.f3649c;
                break;
            default:
                baseFontSize = this.f3648b.getBaseFontSize();
                f7 = this.f3649c;
                break;
        }
        return baseFontSize / f7;
    }
}

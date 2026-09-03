package lh;
public final class v1 implements Runnable {
    public final int f13047a;
    public final x1 f13048b;
    public final boolean f13049c;

    public v1(x1 x1Var, boolean z4, int i10) {
        this.f13047a = i10;
        this.f13048b = x1Var;
        this.f13049c = z4;
    }

    @Override
    public final void run() {
        switch (this.f13047a) {
            case 0:
                boolean z4 = this.f13049c;
                x1 x1Var = this.f13048b;
                if (!z4) {
                    x1Var.D.setVisibility(8);
                    return;
                } else {
                    x1Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f13049c;
                x1 x1Var2 = this.f13048b;
                if (!z10) {
                    x1Var2.v.setVisibility(8);
                    return;
                } else {
                    x1Var2.getClass();
                    return;
                }
        }
    }
}

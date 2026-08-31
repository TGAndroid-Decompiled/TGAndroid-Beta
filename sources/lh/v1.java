package lh;
public final class v1 implements Runnable {
    public final int f13045a;
    public final x1 f13046b;
    public final boolean f13047c;

    public v1(x1 x1Var, boolean z4, int i10) {
        this.f13045a = i10;
        this.f13046b = x1Var;
        this.f13047c = z4;
    }

    @Override
    public final void run() {
        switch (this.f13045a) {
            case 0:
                boolean z4 = this.f13047c;
                x1 x1Var = this.f13046b;
                if (!z4) {
                    x1Var.D.setVisibility(8);
                    return;
                } else {
                    x1Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f13047c;
                x1 x1Var2 = this.f13046b;
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

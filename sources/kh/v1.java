package kh;
public final class v1 implements Runnable {
    public final int f10892a;
    public final x1 f10893b;
    public final boolean f10894c;

    public v1(x1 x1Var, boolean z4, int i10) {
        this.f10892a = i10;
        this.f10893b = x1Var;
        this.f10894c = z4;
    }

    @Override
    public final void run() {
        switch (this.f10892a) {
            case 0:
                boolean z4 = this.f10894c;
                x1 x1Var = this.f10893b;
                if (!z4) {
                    x1Var.D.setVisibility(8);
                    return;
                } else {
                    x1Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f10894c;
                x1 x1Var2 = this.f10893b;
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

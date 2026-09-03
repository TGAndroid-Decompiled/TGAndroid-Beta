package kh;
public final class v1 implements Runnable {
    public final int f10999a;
    public final x1 f11000b;
    public final boolean f11001c;

    public v1(x1 x1Var, boolean z4, int i10) {
        this.f10999a = i10;
        this.f11000b = x1Var;
        this.f11001c = z4;
    }

    @Override
    public final void run() {
        switch (this.f10999a) {
            case 0:
                boolean z4 = this.f11001c;
                x1 x1Var = this.f11000b;
                if (!z4) {
                    x1Var.D.setVisibility(8);
                    return;
                } else {
                    x1Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f11001c;
                x1 x1Var2 = this.f11000b;
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

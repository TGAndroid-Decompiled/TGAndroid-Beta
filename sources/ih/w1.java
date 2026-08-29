package ih;
public final class w1 implements Runnable {
    public final int f9484a;
    public final y1 f9485b;
    public final boolean f9486c;

    public w1(y1 y1Var, boolean z10, int i10) {
        this.f9484a = i10;
        this.f9485b = y1Var;
        this.f9486c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9484a) {
            case 0:
                boolean z10 = this.f9486c;
                y1 y1Var = this.f9485b;
                if (!z10) {
                    y1Var.C.setVisibility(8);
                    return;
                } else {
                    y1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f9486c;
                y1 y1Var2 = this.f9485b;
                if (!z11) {
                    y1Var2.v.setVisibility(8);
                    return;
                } else {
                    y1Var2.getClass();
                    return;
                }
        }
    }
}

package bi;
public final class f2 implements Runnable {
    public final int f3512a;
    public final i2 f3513b;
    public final boolean f3514c;

    public f2(i2 i2Var, boolean z10, int i7) {
        this.f3512a = i7;
        this.f3513b = i2Var;
        this.f3514c = z10;
    }

    @Override
    public final void run() {
        switch (this.f3512a) {
            case 0:
                boolean z10 = this.f3514c;
                i2 i2Var = this.f3513b;
                if (!z10) {
                    i2Var.H.setVisibility(8);
                    return;
                } else {
                    i2Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f3514c;
                i2 i2Var2 = this.f3513b;
                if (!z11) {
                    i2Var2.f3607w.setVisibility(8);
                    return;
                } else {
                    i2Var2.getClass();
                    return;
                }
        }
    }
}

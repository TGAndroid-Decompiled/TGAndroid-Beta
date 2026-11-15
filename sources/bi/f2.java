package bi;
public final class f2 implements Runnable {
    public final int f3509a;
    public final i2 f3510b;
    public final boolean f3511c;

    public f2(i2 i2Var, boolean z10, int i7) {
        this.f3509a = i7;
        this.f3510b = i2Var;
        this.f3511c = z10;
    }

    @Override
    public final void run() {
        switch (this.f3509a) {
            case 0:
                boolean z10 = this.f3511c;
                i2 i2Var = this.f3510b;
                if (!z10) {
                    i2Var.H.setVisibility(8);
                    return;
                } else {
                    i2Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f3511c;
                i2 i2Var2 = this.f3510b;
                if (!z11) {
                    i2Var2.f3604w.setVisibility(8);
                    return;
                } else {
                    i2Var2.getClass();
                    return;
                }
        }
    }
}

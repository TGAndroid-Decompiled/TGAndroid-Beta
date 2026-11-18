package bi;
public final class z2 implements Runnable {
    public final int f4298a;
    public final c3 f4299b;
    public final boolean f4300c;

    public z2(c3 c3Var, boolean z10, int i7) {
        this.f4298a = i7;
        this.f4299b = c3Var;
        this.f4300c = z10;
    }

    @Override
    public final void run() {
        switch (this.f4298a) {
            case 0:
                boolean z10 = this.f4300c;
                c3 c3Var = this.f4299b;
                if (!z10) {
                    c3Var.H.setVisibility(8);
                    return;
                } else {
                    c3Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f4300c;
                c3 c3Var2 = this.f4299b;
                if (!z11) {
                    c3Var2.f3516w.setVisibility(8);
                    return;
                } else {
                    c3Var2.getClass();
                    return;
                }
        }
    }
}

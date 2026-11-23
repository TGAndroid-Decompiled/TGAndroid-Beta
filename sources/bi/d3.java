package bi;
public final class d3 implements Runnable {
    public final int f3535a;
    public final g3 f3536b;
    public final boolean f3537c;

    public d3(g3 g3Var, boolean z10, int i7) {
        this.f3535a = i7;
        this.f3536b = g3Var;
        this.f3537c = z10;
    }

    @Override
    public final void run() {
        switch (this.f3535a) {
            case 0:
                boolean z10 = this.f3537c;
                g3 g3Var = this.f3536b;
                if (!z10) {
                    g3Var.H.setVisibility(8);
                    return;
                } else {
                    g3Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f3537c;
                g3 g3Var2 = this.f3536b;
                if (!z11) {
                    g3Var2.f3674w.setVisibility(8);
                    return;
                } else {
                    g3Var2.getClass();
                    return;
                }
        }
    }
}

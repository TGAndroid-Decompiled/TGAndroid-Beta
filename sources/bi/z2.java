package bi;
public final class z2 implements Runnable {
    public final int f4264a;
    public final c3 f4265b;
    public final boolean f4266c;

    public z2(c3 c3Var, boolean z10, int i7) {
        this.f4264a = i7;
        this.f4265b = c3Var;
        this.f4266c = z10;
    }

    @Override
    public final void run() {
        switch (this.f4264a) {
            case 0:
                boolean z10 = this.f4266c;
                c3 c3Var = this.f4265b;
                if (!z10) {
                    c3Var.H.setVisibility(8);
                    return;
                } else {
                    c3Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f4266c;
                c3 c3Var2 = this.f4265b;
                if (!z11) {
                    c3Var2.f3485w.setVisibility(8);
                    return;
                } else {
                    c3Var2.getClass();
                    return;
                }
        }
    }
}

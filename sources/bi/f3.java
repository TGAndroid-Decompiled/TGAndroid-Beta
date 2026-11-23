package bi;
public final class f3 implements Runnable {
    public final int f3546a;
    public final i3 f3547b;
    public final boolean f3548c;

    public f3(i3 i3Var, boolean z10, int i7) {
        this.f3546a = i7;
        this.f3547b = i3Var;
        this.f3548c = z10;
    }

    @Override
    public final void run() {
        switch (this.f3546a) {
            case 0:
                boolean z10 = this.f3548c;
                i3 i3Var = this.f3547b;
                if (!z10) {
                    i3Var.H.setVisibility(8);
                    return;
                } else {
                    i3Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f3548c;
                i3 i3Var2 = this.f3547b;
                if (!z11) {
                    i3Var2.f3688w.setVisibility(8);
                    return;
                } else {
                    i3Var2.getClass();
                    return;
                }
        }
    }
}

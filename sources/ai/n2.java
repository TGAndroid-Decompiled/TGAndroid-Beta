package ai;
public final class n2 implements Runnable {
    public final int f834a;
    public final q2 f835b;
    public final boolean f836c;

    public n2(q2 q2Var, boolean z10, int i3) {
        this.f834a = i3;
        this.f835b = q2Var;
        this.f836c = z10;
    }

    @Override
    public final void run() {
        switch (this.f834a) {
            case 0:
                boolean z10 = this.f836c;
                q2 q2Var = this.f835b;
                if (!z10) {
                    q2Var.H.setVisibility(8);
                    return;
                } else {
                    q2Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f836c;
                q2 q2Var2 = this.f835b;
                if (!z11) {
                    q2Var2.f920w.setVisibility(8);
                    return;
                } else {
                    q2Var2.getClass();
                    return;
                }
        }
    }
}

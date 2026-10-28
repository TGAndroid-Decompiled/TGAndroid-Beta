package li;
public final class u2 implements Runnable {
    public final int f17508a;
    public final g1 f17509b;
    public final int f17510c;

    public u2(g1 g1Var, int i10, int i11) {
        this.f17508a = i11;
        this.f17509b = g1Var;
        this.f17510c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17508a) {
            case 0:
                g1 g1Var = this.f17509b;
                g1Var.r();
                g1Var.setSelection(Math.max(0, Math.min(this.f17510c, g1Var.length())));
                return;
            case 1:
                g1 g1Var2 = this.f17509b;
                g1Var2.r();
                g1Var2.setSelection(Math.max(0, Math.min(this.f17510c, g1Var2.length())));
                return;
            case 2:
                g1 g1Var3 = this.f17509b;
                g1Var3.r();
                g1Var3.setSelection(Math.max(0, Math.min(this.f17510c, g1Var3.length())));
                return;
            case 3:
                g1 g1Var4 = this.f17509b;
                g1Var4.r();
                g1Var4.setSelection(Math.min(this.f17510c, g1Var4.length()));
                return;
            default:
                g1 g1Var5 = this.f17509b;
                g1Var5.r();
                g1Var5.setSelection(Math.max(0, Math.min(this.f17510c, g1Var5.length())));
                return;
        }
    }
}

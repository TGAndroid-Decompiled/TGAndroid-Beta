package mi;
public final class u2 implements Runnable {
    public final int f19967a;
    public final h1 f19968b;
    public final int f19969c;

    public u2(h1 h1Var, int i3, int i10) {
        this.f19967a = i10;
        this.f19968b = h1Var;
        this.f19969c = i3;
    }

    @Override
    public final void run() {
        switch (this.f19967a) {
            case 0:
                h1 h1Var = this.f19968b;
                h1Var.N();
                h1Var.setSelection(Math.max(0, Math.min(this.f19969c, h1Var.length())));
                return;
            case 1:
                h1 h1Var2 = this.f19968b;
                h1Var2.N();
                h1Var2.setSelection(Math.max(0, Math.min(this.f19969c, h1Var2.length())));
                return;
            case 2:
                h1 h1Var3 = this.f19968b;
                h1Var3.N();
                h1Var3.setSelection(Math.max(0, Math.min(this.f19969c, h1Var3.length())));
                return;
            case 3:
                h1 h1Var4 = this.f19968b;
                h1Var4.N();
                h1Var4.setSelection(Math.min(this.f19969c, h1Var4.length()));
                return;
            default:
                h1 h1Var5 = this.f19968b;
                h1Var5.N();
                h1Var5.setSelection(Math.max(0, Math.min(this.f19969c, h1Var5.length())));
                return;
        }
    }
}

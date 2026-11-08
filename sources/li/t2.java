package li;
public final class t2 implements Runnable {
    public final int f18870a;
    public final g1 f18871b;
    public final int f18872c;

    public t2(g1 g1Var, int i7, int i10) {
        this.f18870a = i10;
        this.f18871b = g1Var;
        this.f18872c = i7;
    }

    @Override
    public final void run() {
        switch (this.f18870a) {
            case 0:
                g1 g1Var = this.f18871b;
                g1Var.N();
                g1Var.setSelection(Math.max(0, Math.min(this.f18872c, g1Var.length())));
                return;
            case 1:
                g1 g1Var2 = this.f18871b;
                g1Var2.N();
                g1Var2.setSelection(Math.max(0, Math.min(this.f18872c, g1Var2.length())));
                return;
            case 2:
                g1 g1Var3 = this.f18871b;
                g1Var3.N();
                g1Var3.setSelection(Math.max(0, Math.min(this.f18872c, g1Var3.length())));
                return;
            case 3:
                g1 g1Var4 = this.f18871b;
                g1Var4.N();
                g1Var4.setSelection(Math.min(this.f18872c, g1Var4.length()));
                return;
            default:
                g1 g1Var5 = this.f18871b;
                g1Var5.N();
                g1Var5.setSelection(Math.max(0, Math.min(this.f18872c, g1Var5.length())));
                return;
        }
    }
}

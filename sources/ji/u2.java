package ji;
public final class u2 implements Runnable {
    public final int f14238a;
    public final h1 f14239b;
    public final int f14240c;

    public u2(h1 h1Var, int i10, int i11) {
        this.f14238a = i11;
        this.f14239b = h1Var;
        this.f14240c = i10;
    }

    @Override
    public final void run() {
        switch (this.f14238a) {
            case 0:
                h1 h1Var = this.f14239b;
                h1Var.r();
                h1Var.setSelection(Math.max(0, Math.min(this.f14240c, h1Var.length())));
                return;
            case 1:
                h1 h1Var2 = this.f14239b;
                h1Var2.r();
                h1Var2.setSelection(Math.max(0, Math.min(this.f14240c, h1Var2.length())));
                return;
            case 2:
                h1 h1Var3 = this.f14239b;
                h1Var3.r();
                h1Var3.setSelection(Math.max(0, Math.min(this.f14240c, h1Var3.length())));
                return;
            case 3:
                h1 h1Var4 = this.f14239b;
                h1Var4.r();
                h1Var4.setSelection(Math.min(this.f14240c, h1Var4.length()));
                return;
            default:
                h1 h1Var5 = this.f14239b;
                h1Var5.r();
                h1Var5.setSelection(Math.max(0, Math.min(this.f14240c, h1Var5.length())));
                return;
        }
    }
}

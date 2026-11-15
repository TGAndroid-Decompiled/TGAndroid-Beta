package oi;
public final class r2 implements Runnable {
    public final int f21976a;
    public final e1 f21977b;
    public final int f21978c;

    public r2(e1 e1Var, int i7, int i10) {
        this.f21976a = i10;
        this.f21977b = e1Var;
        this.f21978c = i7;
    }

    @Override
    public final void run() {
        switch (this.f21976a) {
            case 0:
                e1 e1Var = this.f21977b;
                e1Var.O();
                e1Var.setSelection(Math.max(0, Math.min(this.f21978c, e1Var.length())));
                return;
            case 1:
                e1 e1Var2 = this.f21977b;
                e1Var2.O();
                e1Var2.setSelection(Math.max(0, Math.min(this.f21978c, e1Var2.length())));
                return;
            case 2:
                e1 e1Var3 = this.f21977b;
                e1Var3.O();
                e1Var3.setSelection(Math.max(0, Math.min(this.f21978c, e1Var3.length())));
                return;
            case 3:
                e1 e1Var4 = this.f21977b;
                e1Var4.O();
                e1Var4.setSelection(Math.min(this.f21978c, e1Var4.length()));
                return;
            default:
                e1 e1Var5 = this.f21977b;
                e1Var5.O();
                e1Var5.setSelection(Math.max(0, Math.min(this.f21978c, e1Var5.length())));
                return;
        }
    }
}

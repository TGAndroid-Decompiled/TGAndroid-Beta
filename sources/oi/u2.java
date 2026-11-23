package oi;
public final class u2 implements Runnable {
    public final int f22459a;
    public final f1 f22460b;
    public final int f22461c;

    public u2(f1 f1Var, int i7, int i10) {
        this.f22459a = i10;
        this.f22460b = f1Var;
        this.f22461c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22459a) {
            case 0:
                f1 f1Var = this.f22460b;
                f1Var.O();
                f1Var.setSelection(Math.max(0, Math.min(this.f22461c, f1Var.length())));
                return;
            case 1:
                f1 f1Var2 = this.f22460b;
                f1Var2.O();
                f1Var2.setSelection(Math.max(0, Math.min(this.f22461c, f1Var2.length())));
                return;
            case 2:
                f1 f1Var3 = this.f22460b;
                f1Var3.O();
                f1Var3.setSelection(Math.max(0, Math.min(this.f22461c, f1Var3.length())));
                return;
            case 3:
                f1 f1Var4 = this.f22460b;
                f1Var4.O();
                f1Var4.setSelection(Math.min(this.f22461c, f1Var4.length()));
                return;
            default:
                f1 f1Var5 = this.f22460b;
                f1Var5.O();
                f1Var5.setSelection(Math.max(0, Math.min(this.f22461c, f1Var5.length())));
                return;
        }
    }
}

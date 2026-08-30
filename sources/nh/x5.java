package nh;
public final class x5 implements Runnable {
    public final int f16057a;
    public final t6 f16058b;

    public x5(t6 t6Var, int i10) {
        this.f16057a = i10;
        this.f16058b = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f16057a) {
            case 0:
                t6 t6Var = this.f16058b;
                t6Var.R = false;
                t6Var.S = null;
                return;
            case 1:
                t6 t6Var2 = this.f16058b;
                t6Var2.f15932s = true;
                t6Var2.f15925l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                t6 t6Var3 = this.f16058b;
                t6Var3.R = false;
                t6Var3.S = null;
                return;
        }
    }
}

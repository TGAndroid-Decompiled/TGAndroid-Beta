package lh;
public final class w5 implements Runnable {
    public final int f16363a;
    public final s6 f16364b;

    public w5(s6 s6Var, int i10) {
        this.f16363a = i10;
        this.f16364b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f16363a) {
            case 0:
                s6 s6Var = this.f16364b;
                s6Var.R = false;
                s6Var.S = null;
                return;
            case 1:
                s6 s6Var2 = this.f16364b;
                s6Var2.f16234s = true;
                s6Var2.f16227l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                s6 s6Var3 = this.f16364b;
                s6Var3.R = false;
                s6Var3.S = null;
                return;
        }
    }
}

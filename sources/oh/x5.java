package oh;
public final class x5 implements Runnable {
    public final int f17926a;
    public final t6 f17927b;

    public x5(t6 t6Var, int i10) {
        this.f17926a = i10;
        this.f17927b = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f17926a) {
            case 0:
                t6 t6Var = this.f17927b;
                t6Var.R = false;
                t6Var.S = null;
                return;
            case 1:
                t6 t6Var2 = this.f17927b;
                t6Var2.f17786s = true;
                t6Var2.f17779l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                t6 t6Var3 = this.f17927b;
                t6Var3.R = false;
                t6Var3.S = null;
                return;
        }
    }
}

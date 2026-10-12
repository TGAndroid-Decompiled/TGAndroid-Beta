package bi;
public final class v7 implements Runnable {
    public final int f3875a;
    public final x8 f3876b;

    public v7(x8 x8Var, int i10) {
        this.f3875a = i10;
        this.f3876b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f3875a) {
            case 0:
                x8 x8Var = this.f3876b;
                x8Var.R = false;
                x8Var.S = null;
                return;
            case 1:
                x8 x8Var2 = this.f3876b;
                x8Var2.f3977s = true;
                x8Var2.f3970l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                x8 x8Var3 = this.f3876b;
                x8Var3.R = false;
                x8Var3.S = null;
                return;
        }
    }
}

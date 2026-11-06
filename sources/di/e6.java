package di;
public final class e6 implements Runnable {
    public final int f8967a;
    public final y6 f8968b;

    public e6(y6 y6Var, int i7) {
        this.f8967a = i7;
        this.f8968b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f8967a) {
            case 0:
                y6 y6Var = this.f8968b;
                y6Var.R = false;
                y6Var.S = null;
                return;
            case 1:
                y6 y6Var2 = this.f8968b;
                y6Var2.f9979s = true;
                y6Var2.f9972l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                y6 y6Var3 = this.f8968b;
                y6Var3.R = false;
                y6Var3.S = null;
                return;
        }
    }
}

package ai;
public final class j8 implements Runnable {
    public final int f1135a;
    public final l9 f1136b;

    public j8(l9 l9Var, int i10) {
        this.f1135a = i10;
        this.f1136b = l9Var;
    }

    @Override
    public final void run() {
        switch (this.f1135a) {
            case 0:
                l9 l9Var = this.f1136b;
                l9Var.R = false;
                l9Var.S = null;
                return;
            case 1:
                l9 l9Var2 = this.f1136b;
                l9Var2.f1306s = true;
                l9Var2.f1299l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                l9 l9Var3 = this.f1136b;
                l9Var3.R = false;
                l9Var3.S = null;
                return;
        }
    }
}

package ai;
public final class j8 implements Runnable {
    public final int f1049a;
    public final l9 f1050b;

    public j8(l9 l9Var, int i10) {
        this.f1049a = i10;
        this.f1050b = l9Var;
    }

    @Override
    public final void run() {
        switch (this.f1049a) {
            case 0:
                l9 l9Var = this.f1050b;
                l9Var.R = false;
                l9Var.S = null;
                return;
            case 1:
                l9 l9Var2 = this.f1050b;
                l9Var2.f1207s = true;
                l9Var2.f1200l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                l9 l9Var3 = this.f1050b;
                l9Var3.R = false;
                l9Var3.S = null;
                return;
        }
    }
}

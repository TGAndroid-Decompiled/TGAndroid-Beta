package ai;
public final class i8 implements Runnable {
    public final int f1006a;
    public final l9 f1007b;

    public i8(l9 l9Var, int i10) {
        this.f1006a = i10;
        this.f1007b = l9Var;
    }

    @Override
    public final void run() {
        switch (this.f1006a) {
            case 0:
                l9 l9Var = this.f1007b;
                l9Var.R = false;
                l9Var.S = null;
                return;
            case 1:
                l9 l9Var2 = this.f1007b;
                l9Var2.f1203s = true;
                l9Var2.f1196l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                l9 l9Var3 = this.f1007b;
                l9Var3.R = false;
                l9Var3.S = null;
                return;
        }
    }
}

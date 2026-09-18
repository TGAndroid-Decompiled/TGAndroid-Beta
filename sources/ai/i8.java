package ai;
public final class i8 implements Runnable {
    public final int f1011a;
    public final l9 f1012b;

    public i8(l9 l9Var, int i10) {
        this.f1011a = i10;
        this.f1012b = l9Var;
    }

    @Override
    public final void run() {
        switch (this.f1011a) {
            case 0:
                l9 l9Var = this.f1012b;
                l9Var.R = false;
                l9Var.S = null;
                return;
            case 1:
                l9 l9Var2 = this.f1012b;
                l9Var2.f1208s = true;
                l9Var2.f1201l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                l9 l9Var3 = this.f1012b;
                l9Var3.R = false;
                l9Var3.S = null;
                return;
        }
    }
}

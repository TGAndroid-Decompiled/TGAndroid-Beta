package di;
public final class f6 implements Runnable {
    public final int f8993a;
    public final z6 f8994b;

    public f6(z6 z6Var, int i7) {
        this.f8993a = i7;
        this.f8994b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f8993a) {
            case 0:
                z6 z6Var = this.f8994b;
                z6Var.R = false;
                z6Var.S = null;
                return;
            case 1:
                z6 z6Var2 = this.f8994b;
                z6Var2.f10008s = true;
                z6Var2.f10001l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                z6 z6Var3 = this.f8994b;
                z6Var3.R = false;
                z6Var3.S = null;
                return;
        }
    }
}

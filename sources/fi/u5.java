package fi;
public final class u5 implements Runnable {
    public final int f12616a;
    public final p6 f12617b;

    public u5(p6 p6Var, int i7) {
        this.f12616a = i7;
        this.f12617b = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f12616a) {
            case 0:
                p6 p6Var = this.f12617b;
                p6Var.R = false;
                p6Var.S = null;
                return;
            case 1:
                p6 p6Var2 = this.f12617b;
                p6Var2.f12401s = true;
                p6Var2.f12394l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                p6 p6Var3 = this.f12617b;
                p6Var3.R = false;
                p6Var3.S = null;
                return;
        }
    }
}

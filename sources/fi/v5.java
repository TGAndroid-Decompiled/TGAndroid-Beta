package fi;
public final class v5 implements Runnable {
    public final int f12654a;
    public final p6 f12655b;

    public v5(p6 p6Var, int i7) {
        this.f12654a = i7;
        this.f12655b = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f12654a) {
            case 0:
                p6 p6Var = this.f12655b;
                p6Var.R = false;
                p6Var.S = null;
                return;
            case 1:
                p6 p6Var2 = this.f12655b;
                p6Var2.f12403s = true;
                p6Var2.f12396l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                p6 p6Var3 = this.f12655b;
                p6Var3.R = false;
                p6Var3.S = null;
                return;
        }
    }
}

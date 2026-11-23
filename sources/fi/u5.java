package fi;
public final class u5 implements Runnable {
    public final int f12608a;
    public final p6 f12609b;

    public u5(p6 p6Var, int i7) {
        this.f12608a = i7;
        this.f12609b = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f12608a) {
            case 0:
                p6 p6Var = this.f12609b;
                p6Var.R = false;
                p6Var.S = null;
                return;
            case 1:
                p6 p6Var2 = this.f12609b;
                p6Var2.f12393s = true;
                p6Var2.f12386l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                p6 p6Var3 = this.f12609b;
                p6Var3.R = false;
                p6Var3.S = null;
                return;
        }
    }
}

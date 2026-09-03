package oh;
public final class x5 implements Runnable {
    public final int f17928a;
    public final t6 f17929b;

    public x5(t6 t6Var, int i10) {
        this.f17928a = i10;
        this.f17929b = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f17928a) {
            case 0:
                t6 t6Var = this.f17929b;
                t6Var.R = false;
                t6Var.S = null;
                return;
            case 1:
                t6 t6Var2 = this.f17929b;
                t6Var2.f17788s = true;
                t6Var2.f17781l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                t6 t6Var3 = this.f17929b;
                t6Var3.R = false;
                t6Var3.S = null;
                return;
        }
    }
}

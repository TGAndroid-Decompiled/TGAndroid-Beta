package ih;
public final class z5 implements Runnable {
    public final int f12374a;
    public final v6 f12375b;

    public z5(v6 v6Var, int i9) {
        this.f12374a = i9;
        this.f12375b = v6Var;
    }

    @Override
    public final void run() {
        switch (this.f12374a) {
            case 0:
                v6 v6Var = this.f12375b;
                v6Var.R = false;
                v6Var.S = null;
                return;
            case 1:
                v6 v6Var2 = this.f12375b;
                v6Var2.f12252s = true;
                v6Var2.f12245l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                v6 v6Var3 = this.f12375b;
                v6Var3.R = false;
                v6Var3.S = null;
                return;
        }
    }
}

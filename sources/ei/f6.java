package ei;
public final class f6 implements Runnable {
    public final int f10271a;
    public final z6 f10272b;

    public f6(z6 z6Var, int i3) {
        this.f10271a = i3;
        this.f10272b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f10271a) {
            case 0:
                z6 z6Var = this.f10272b;
                z6Var.R = false;
                z6Var.S = null;
                return;
            case 1:
                z6 z6Var2 = this.f10272b;
                z6Var2.f11290s = true;
                z6Var2.f11283l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                z6 z6Var3 = this.f10272b;
                z6Var3.R = false;
                z6Var3.S = null;
                return;
        }
    }
}

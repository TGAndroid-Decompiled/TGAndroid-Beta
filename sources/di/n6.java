package di;
public final class n6 implements Runnable {
    public final int f8835a;
    public final h7 f8836b;

    public n6(h7 h7Var, int i10) {
        this.f8835a = i10;
        this.f8836b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f8835a) {
            case 0:
                h7 h7Var = this.f8836b;
                h7Var.R = false;
                h7Var.S = null;
                return;
            case 1:
                h7 h7Var2 = this.f8836b;
                h7Var2.f8645s = true;
                h7Var2.f8638l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                h7 h7Var3 = this.f8836b;
                h7Var3.R = false;
                h7Var3.S = null;
                return;
        }
    }
}

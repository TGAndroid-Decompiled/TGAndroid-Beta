package ci;
public final class m6 implements Runnable {
    public final int f5550a;
    public final h7 f5551b;

    public m6(h7 h7Var, int i10) {
        this.f5550a = i10;
        this.f5551b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f5550a) {
            case 0:
                h7 h7Var = this.f5551b;
                h7Var.R = false;
                h7Var.S = null;
                return;
            case 1:
                h7 h7Var2 = this.f5551b;
                h7Var2.f5412s = true;
                h7Var2.f5405l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                h7 h7Var3 = this.f5551b;
                h7Var3.R = false;
                h7Var3.S = null;
                return;
        }
    }
}

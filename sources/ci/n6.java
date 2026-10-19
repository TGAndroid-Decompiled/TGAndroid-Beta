package ci;
public final class n6 implements Runnable {
    public final int f5648a;
    public final i7 f5649b;

    public n6(i7 i7Var, int i10) {
        this.f5648a = i10;
        this.f5649b = i7Var;
    }

    @Override
    public final void run() {
        switch (this.f5648a) {
            case 0:
                i7 i7Var = this.f5649b;
                i7Var.R = false;
                i7Var.S = null;
                return;
            case 1:
                i7 i7Var2 = this.f5649b;
                i7Var2.f5506s = true;
                i7Var2.f5499l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                i7 i7Var3 = this.f5649b;
                i7Var3.R = false;
                i7Var3.S = null;
                return;
        }
    }
}

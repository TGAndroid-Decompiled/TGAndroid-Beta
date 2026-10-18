package ci;
public final class n6 implements Runnable {
    public final int f5651a;
    public final i7 f5652b;

    public n6(i7 i7Var, int i10) {
        this.f5651a = i10;
        this.f5652b = i7Var;
    }

    @Override
    public final void run() {
        switch (this.f5651a) {
            case 0:
                i7 i7Var = this.f5652b;
                i7Var.R = false;
                i7Var.S = null;
                return;
            case 1:
                i7 i7Var2 = this.f5652b;
                i7Var2.f5509s = true;
                i7Var2.f5502l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                i7 i7Var3 = this.f5652b;
                i7Var3.R = false;
                i7Var3.S = null;
                return;
        }
    }
}

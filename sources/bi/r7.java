package bi;
public final class r7 implements Runnable {
    public final int f3684a;
    public final u8 f3685b;

    public r7(u8 u8Var, int i10) {
        this.f3684a = i10;
        this.f3685b = u8Var;
    }

    @Override
    public final void run() {
        switch (this.f3684a) {
            case 0:
                u8 u8Var = this.f3685b;
                u8Var.R = false;
                u8Var.S = null;
                return;
            case 1:
                u8 u8Var2 = this.f3685b;
                u8Var2.f3848s = true;
                u8Var2.f3841l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                u8 u8Var3 = this.f3685b;
                u8Var3.R = false;
                u8Var3.S = null;
                return;
        }
    }
}

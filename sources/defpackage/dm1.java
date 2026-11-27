package defpackage;
public final class dm1 implements Runnable {
    public final byte a;
    public final mu9 b;

    public dm1(mu9 mu9Var, byte b) {
        this.a = b;
        this.b = mu9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mu9 mu9Var = this.b;
        switch (b) {
            case 0:
                if (!mu9Var.N) {
                    mu9Var.N = true;
                    mu9Var.a(new dm1(mu9Var, (byte) 2), false);
                    mu9Var.s.invalidate();
                    return;
                }
                return;
            case 1:
                mu9Var.dismiss();
                return;
            case 2:
                mu9Var.getClass();
                hl.c3(new dm1(mu9Var, (byte) 4));
                return;
            case 3:
                hl.c3(new dm1(mu9Var, (byte) 5));
                return;
            case 4:
                mu9Var.c();
                return;
            default:
                mu9Var.b();
                return;
        }
    }
}

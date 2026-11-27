package defpackage;
public final class yf9 implements Runnable {
    public final byte a;
    public final dg9 b;

    public yf9(dg9 dg9Var, byte b) {
        this.a = b;
        this.b = dg9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dg9 dg9Var = this.b;
        switch (b) {
            case 0:
                dj9 dj9Var = dg9Var.M2;
                if (dj9Var != null && dg9Var.g2 != null) {
                    dg9Var.N2 = true;
                    dj9Var.b().a.m(false);
                    try {
                        dg9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((oh9) dg9Var.g2).a(dg9Var, dg9Var.M2, true);
                    return;
                }
                return;
            case 1:
                dg9Var.K();
                return;
            default:
                dg9Var.P();
                return;
        }
    }
}

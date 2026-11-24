package defpackage;
public final class ie9 implements Runnable {
    public final byte a;
    public final ne9 b;

    public ie9(ne9 ne9Var, byte b) {
        this.a = b;
        this.b = ne9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ne9 ne9Var = this.b;
        switch (b) {
            case 0:
                qh9 qh9Var = ne9Var.L2;
                if (qh9Var != null && ne9Var.f2 != null) {
                    ne9Var.M2 = true;
                    qh9Var.b().a.n(false);
                    try {
                        ne9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((ag9) ne9Var.f2).a(ne9Var, ne9Var.L2, true);
                    return;
                }
                return;
            case 1:
                ne9Var.K();
                return;
            default:
                ne9Var.P();
                return;
        }
    }
}

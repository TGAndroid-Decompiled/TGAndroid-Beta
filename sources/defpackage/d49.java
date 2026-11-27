package defpackage;
public final class d49 implements Runnable {
    public final byte a;
    public final g49 b;

    public d49(g49 g49Var, byte b) {
        this.a = b;
        this.b = g49Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().y() != null && !this.b.a.getImageReceiver().y().l0 && !this.b.a.getImageReceiver().y().t()) {
                    this.b.a.getImageReceiver().y().start();
                }
                this.b.F = false;
                return;
            default:
                g49 g49Var = this.b;
                i49 i49Var = g49Var.Q;
                try {
                    g49Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i49Var.n0 = i49Var.U.indexOf(g49Var.e);
                i49Var.m0 = g49Var.e;
                i49Var.invalidate();
                return;
        }
    }
}

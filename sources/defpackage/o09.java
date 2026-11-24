package defpackage;
public final class o09 implements Runnable {
    public final byte a;
    public final r09 b;

    public o09(r09 r09Var, byte b) {
        this.a = b;
        this.b = r09Var;
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
                r09 r09Var = this.b;
                t09 t09Var = r09Var.Q;
                try {
                    r09Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                t09Var.n0 = t09Var.U.indexOf(r09Var.e);
                t09Var.m0 = r09Var.e;
                t09Var.invalidate();
                return;
        }
    }
}

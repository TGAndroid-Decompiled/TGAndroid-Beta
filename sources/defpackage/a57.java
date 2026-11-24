package defpackage;
public final class a57 implements Runnable {
    public final byte a;
    public final b57 b;

    public a57(b57 b57Var, byte b) {
        this.a = b;
        this.b = b57Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b57 b57Var = this.b;
        switch (b) {
            case 0:
                if (b57Var.W != -1) {
                    nm7.f(b57Var.Y.d0.x).j(b57Var.W);
                    b57Var.W = -1;
                    return;
                }
                return;
            case 1:
                b57Var.Y.i();
                return;
            default:
                if (b57Var.W != -1) {
                    nm7.f(b57Var.Y.d0.x).j(b57Var.W);
                    b57Var.W = -1;
                    return;
                }
                return;
        }
    }
}

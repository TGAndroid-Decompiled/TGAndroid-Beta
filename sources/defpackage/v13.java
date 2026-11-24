package defpackage;
public final class v13 implements Runnable {
    public final byte a;
    public final w13 b;
    public final us4 c;

    public v13(w13 w13Var, us4 us4Var, byte b) {
        this.a = b;
        this.b = w13Var;
        this.c = us4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        us4 us4Var = this.c;
        w13 w13Var = this.b;
        switch (b) {
            case 0:
                w13Var.e().L(us4Var);
                return;
            case 1:
                w13Var.e().L(us4Var);
                return;
            default:
                w13Var.e().L(us4Var);
                return;
        }
    }
}

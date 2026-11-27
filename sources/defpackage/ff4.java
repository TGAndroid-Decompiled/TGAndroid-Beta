package defpackage;
public final class ff4 implements Runnable {
    public final byte a;
    public final hf4 b;

    public ff4(hf4 hf4Var, byte b) {
        this.a = b;
        this.b = hf4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hf4 hf4Var = this.b;
        switch (b) {
            case 0:
                hf4Var.d();
                return;
            case 1:
                hf4Var.a();
                return;
            default:
                hf4Var.b(hf4Var.E);
                return;
        }
    }
}

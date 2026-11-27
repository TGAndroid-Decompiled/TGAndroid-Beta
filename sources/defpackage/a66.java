package defpackage;
public final class a66 implements Runnable {
    public final byte a;
    public final e66 b;

    public a66(e66 e66Var, byte b) {
        this.a = b;
        this.b = e66Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                e66Var.b();
                return;
            default:
                e66Var.c();
                return;
        }
    }
}

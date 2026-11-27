package defpackage;
public final class h57 implements Runnable {
    public final byte a;
    public final i57 b;

    public h57(i57 i57Var, byte b) {
        this.a = b;
        this.b = i57Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i57 i57Var = this.b;
        switch (b) {
            case 0:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    return;
                }
                return;
            case 1:
                i57Var.Y.i();
                return;
            default:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    return;
                }
                return;
        }
    }
}

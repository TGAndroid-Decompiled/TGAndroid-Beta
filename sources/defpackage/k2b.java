package defpackage;
public final class k2b implements Runnable {
    public final byte a;
    public final ny8 b;

    public k2b(ny8 ny8Var, byte b) {
        this.a = b;
        this.b = ny8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ny8 ny8Var = this.b;
        switch (b) {
            case 0:
                ny8Var.b();
                return;
            default:
                ny8Var.b();
                return;
        }
    }
}

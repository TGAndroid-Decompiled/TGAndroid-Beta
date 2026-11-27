package defpackage;
public final class ik3 implements Runnable {
    public final byte a;
    public final nk3 b;

    public ik3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.X(false);
                return;
            default:
                nk3Var.O(true);
                return;
        }
    }
}

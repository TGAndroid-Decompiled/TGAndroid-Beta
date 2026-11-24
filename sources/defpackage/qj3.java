package defpackage;
public final class qj3 implements Runnable {
    public final byte a;
    public final vj3 b;

    public qj3(vj3 vj3Var, byte b) {
        this.a = b;
        this.b = vj3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vj3 vj3Var = this.b;
        switch (b) {
            case 0:
                vj3Var.X(false);
                return;
            default:
                vj3Var.O(true);
                return;
        }
    }
}

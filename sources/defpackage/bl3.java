package defpackage;
public final class bl3 implements Runnable {
    public final byte a;
    public final gl3 b;

    public bl3(gl3 gl3Var, byte b) {
        this.a = b;
        this.b = gl3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gl3 gl3Var = this.b;
        switch (b) {
            case 0:
                gl3Var.X(false);
                return;
            default:
                gl3Var.O(true);
                return;
        }
    }
}

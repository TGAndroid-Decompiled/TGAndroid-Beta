package defpackage;
public final class ix7 implements Runnable {
    public final byte a;
    public final gl2 b;

    public ix7(gl2 gl2Var, byte b) {
        this.a = b;
        this.b = gl2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gl2 gl2Var = this.b;
        switch (b) {
            case 0:
                gl2Var.D(1.0f);
                return;
            default:
                gl2Var.D(1.0f);
                return;
        }
    }
}

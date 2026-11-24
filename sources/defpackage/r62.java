package defpackage;
public final class r62 implements Runnable {
    public final byte a;
    public final it3 b;

    public r62(it3 it3Var, byte b) {
        this.a = b;
        this.b = it3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        it3 it3Var = this.b;
        switch (b) {
            case 0:
                ht3 ht3Var = it3Var.d;
                ht3Var.requestFocus();
                gl.E3(ht3Var);
                return;
            default:
                gl.t1(it3Var.d);
                return;
        }
    }
}

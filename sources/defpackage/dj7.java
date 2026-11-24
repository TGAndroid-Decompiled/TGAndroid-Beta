package defpackage;
public final class dj7 implements Runnable {
    public final byte a;
    public final jj7 b;

    public dj7(jj7 jj7Var, byte b) {
        this.a = b;
        this.b = jj7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jj7 jj7Var = this.b;
        switch (b) {
            case 0:
                gl.t1(jj7Var.l1);
                return;
            default:
                gl.F3(jj7Var.m1.getEditText());
                return;
        }
    }
}

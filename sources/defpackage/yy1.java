package defpackage;
public final class yy1 implements Runnable {
    public final byte a;
    public final az1 b;

    public yy1(az1 az1Var, byte b) {
        this.a = b;
        this.b = az1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        az1 az1Var = this.b;
        switch (b) {
            case 0:
                az1Var.a();
                return;
            default:
                gl.e3(az1Var.E, 400L);
                az1Var.c();
                return;
        }
    }
}

package defpackage;
public final class zk1 implements Runnable {
    public final byte a;
    public final tq9 b;

    public zk1(tq9 tq9Var, byte b) {
        this.a = b;
        this.b = tq9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tq9 tq9Var = this.b;
        switch (b) {
            case 0:
                if (!tq9Var.N) {
                    tq9Var.N = true;
                    tq9Var.a(new zk1(tq9Var, (byte) 2), false);
                    tq9Var.s.invalidate();
                    return;
                }
                return;
            case 1:
                tq9Var.dismiss();
                return;
            case 2:
                tq9Var.getClass();
                gl.c3(new zk1(tq9Var, (byte) 4));
                return;
            case 3:
                gl.c3(new zk1(tq9Var, (byte) 5));
                return;
            case 4:
                tq9Var.c();
                return;
            default:
                tq9Var.b();
                return;
        }
    }
}

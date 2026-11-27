package defpackage;
public final class mk4 implements Runnable {
    public final byte a;
    public final rk4 b;
    public final sh9 c;

    public mk4(rk4 rk4Var, sh9 sh9Var, byte b) {
        this.a = b;
        this.b = rk4Var;
        this.c = sh9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sh9 sh9Var = this.c;
        rk4 rk4Var = this.b;
        rk4Var.getClass();
        switch (b) {
            case 0:
                hl.d3(new mk4(rk4Var, sh9Var, (byte) 1), 320L);
                return;
            default:
                sh9Var.a(new zj3(rk4Var, (byte) 9));
                return;
        }
    }
}

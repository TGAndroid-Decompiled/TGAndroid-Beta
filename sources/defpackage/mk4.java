package defpackage;
public final class mk4 implements Runnable {
    public final byte a;
    public final rk4 b;
    public final eg9 c;

    public mk4(rk4 rk4Var, eg9 eg9Var, byte b) {
        this.a = b;
        this.b = rk4Var;
        this.c = eg9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eg9 eg9Var = this.c;
        rk4 rk4Var = this.b;
        rk4Var.getClass();
        switch (b) {
            case 0:
                gm.d3(new mk4(rk4Var, eg9Var, (byte) 1), 320L);
                return;
            default:
                eg9Var.a(new sk3(rk4Var, (byte) 9));
                return;
        }
    }
}

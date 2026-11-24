package defpackage;
public final class ey2 implements Runnable {
    public final byte a;
    public final rc1 b;
    public final dv8 c;

    public ey2(rc1 rc1Var, dv8 dv8Var, byte b) {
        this.a = b;
        this.b = rc1Var;
        this.c = dv8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dv8 dv8Var = this.c;
        rc1 rc1Var = this.b;
        switch (b) {
            case 0:
                rc1Var.a(dv8Var);
                return;
            default:
                rc1Var.a(dv8Var);
                return;
        }
    }
}

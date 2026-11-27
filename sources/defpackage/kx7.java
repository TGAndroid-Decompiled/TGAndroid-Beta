package defpackage;
public final class kx7 implements Runnable {
    public final byte a;
    public final nx7 b;

    public kx7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.c = null;
                xh4 xh4Var = nx7Var.a;
                if (xh4Var != null) {
                    xh4Var.v();
                    return;
                }
                return;
            default:
                nx7Var.b();
                return;
        }
    }
}

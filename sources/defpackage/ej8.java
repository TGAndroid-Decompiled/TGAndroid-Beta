package defpackage;
public final class ej8 implements Runnable {
    public final byte a;
    public final jj8 b;

    public ej8(jj8 jj8Var, byte b) {
        this.a = b;
        this.b = jj8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jj8 jj8Var = this.b;
        switch (b) {
            case 0:
                hj2 hj2Var = jj8Var.h;
                if (hj2Var != null) {
                    hj2Var.close();
                    return;
                }
                return;
            default:
                jj8Var.a();
                return;
        }
    }
}

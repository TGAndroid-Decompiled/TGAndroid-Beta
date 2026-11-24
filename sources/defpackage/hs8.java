package defpackage;
public final class hs8 implements Runnable {
    public final byte a;
    public final rs8 b;

    public hs8(rs8 rs8Var, byte b) {
        this.a = b;
        this.b = rs8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rs8 rs8Var = this.b;
        switch (b) {
            case 0:
                rs8Var.b();
                return;
            case 1:
                rs8Var.c();
                return;
            case 2:
                rs8Var.f(false);
                return;
            default:
                rs8Var.d();
                return;
        }
    }
}

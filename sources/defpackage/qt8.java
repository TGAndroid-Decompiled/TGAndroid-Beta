package defpackage;
public final class qt8 implements Runnable {
    public final byte a;
    public final au8 b;

    public qt8(au8 au8Var, byte b) {
        this.a = b;
        this.b = au8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        au8 au8Var = this.b;
        switch (b) {
            case 0:
                au8Var.b();
                return;
            case 1:
                au8Var.c();
                return;
            case 2:
                au8Var.f(false);
                return;
            default:
                au8Var.d();
                return;
        }
    }
}

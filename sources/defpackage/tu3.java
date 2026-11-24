package defpackage;
public final class tu3 implements Runnable {
    public final byte a;
    public final vu3 b;

    public tu3(vu3 vu3Var, byte b) {
        this.a = b;
        this.b = vu3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vu3 vu3Var = this.b;
        switch (b) {
            case 0:
                vu3Var.post(new tu3(vu3Var, (byte) 1));
                return;
            default:
                vu3Var.h();
                vu3Var.d();
                return;
        }
    }
}

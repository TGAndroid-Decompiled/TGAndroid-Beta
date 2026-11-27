package defpackage;
public final class au3 implements Runnable {
    public final byte a;
    public final cu3 b;

    public au3(cu3 cu3Var, byte b) {
        this.a = b;
        this.b = cu3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cu3 cu3Var = this.b;
        switch (b) {
            case 0:
                cu3Var.post(new au3(cu3Var, (byte) 1));
                return;
            default:
                cu3Var.h();
                cu3Var.d();
                return;
        }
    }
}

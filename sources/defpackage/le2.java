package defpackage;
public final class le2 implements Runnable {
    public final byte a;
    public final kf2 b;

    public le2(kf2 kf2Var, byte b) {
        this.a = b;
        this.b = kf2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kf2 kf2Var = this.b;
        switch (b) {
            case 0:
                kf2Var.t0();
                return;
            default:
                kf2Var.getMessagesController().X2(0, kf2Var.N, true);
                return;
        }
    }
}

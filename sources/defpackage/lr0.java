package defpackage;
public final class lr0 implements Runnable {
    public final byte a;
    public final rr0 b;

    public lr0(rr0 rr0Var, byte b) {
        this.a = b;
        this.b = rr0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rr0 rr0Var = this.b;
        switch (b) {
            case 0:
                rr0Var.k0();
                return;
            default:
                rr0Var.getSendMessagesHelper().q0(p7a.b("/start", rr0Var.a, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
        }
    }
}

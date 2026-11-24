package defpackage;
public final class ls0 implements Runnable {
    public final byte a;
    public final rs0 b;

    public ls0(rs0 rs0Var, byte b) {
        this.a = b;
        this.b = rs0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rs0 rs0Var = this.b;
        switch (b) {
            case 0:
                rs0Var.l0();
                return;
            default:
                rs0Var.getSendMessagesHelper().q0(y5a.b("/start", rs0Var.a, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
        }
    }
}

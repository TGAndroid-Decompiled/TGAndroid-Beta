package defpackage;
public final class cf2 implements Runnable {
    public final byte a;
    public final bg2 b;

    public cf2(bg2 bg2Var, byte b) {
        this.a = b;
        this.b = bg2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bg2 bg2Var = this.b;
        switch (b) {
            case 0:
                bg2Var.t0();
                return;
            default:
                bg2Var.getMessagesController().e3(0, bg2Var.N, true);
                return;
        }
    }
}

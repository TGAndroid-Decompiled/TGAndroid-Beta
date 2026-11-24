package defpackage;
public final class wf2 implements Runnable {
    public final byte a;
    public final wg2 b;

    public wf2(wg2 wg2Var, byte b) {
        this.a = b;
        this.b = wg2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wg2 wg2Var = this.b;
        switch (b) {
            case 0:
                wg2Var.u0();
                return;
            default:
                wg2Var.getMessagesController().a3(0, wg2Var.N, true);
                return;
        }
    }
}

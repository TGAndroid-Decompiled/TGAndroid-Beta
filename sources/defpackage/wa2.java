package defpackage;
public final class wa2 implements Runnable {
    public final byte a;
    public final ib2 b;

    public wa2(ib2 ib2Var, byte b) {
        this.a = b;
        this.b = ib2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ib2 ib2Var = this.b;
        switch (b) {
            case 0:
                he heVar = ib2Var.r;
                if (heVar != null) {
                    heVar.setOnCancelListener(new ct0(ib2Var, (byte) 6));
                    ib2Var.showDialog(ib2Var.r);
                    return;
                }
                return;
            case 1:
                ib2Var.getMessagesController().a3(0, ib2Var.F, true);
                return;
            default:
                ib2Var.getMessagesController().a3(0, ib2Var.F, true);
                return;
        }
    }
}

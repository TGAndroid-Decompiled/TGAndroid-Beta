package defpackage;
public final class k92 implements Runnable {
    public final byte a;
    public final x92 b;

    public k92(x92 x92Var, byte b) {
        this.a = b;
        this.b = x92Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x92 x92Var = this.b;
        switch (b) {
            case 0:
                hd hdVar = x92Var.r;
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new ur0(x92Var, (byte) 6));
                    x92Var.showDialog(x92Var.r);
                    return;
                }
                return;
            case 1:
                x92Var.getMessagesController().X2(0, x92Var.F, true);
                return;
            default:
                x92Var.getMessagesController().X2(0, x92Var.F, true);
                return;
        }
    }
}

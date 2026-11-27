package defpackage;
public final class aa2 implements Runnable {
    public final byte a;
    public final na2 b;

    public aa2(na2 na2Var, byte b) {
        this.a = b;
        this.b = na2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        na2 na2Var = this.b;
        switch (b) {
            case 0:
                id idVar = na2Var.r;
                if (idVar != null) {
                    idVar.setOnCancelListener(new cs0(na2Var, (byte) 6));
                    na2Var.showDialog(na2Var.r);
                    return;
                }
                return;
            case 1:
                na2Var.getMessagesController().e3(0, na2Var.F, true);
                return;
            default:
                na2Var.getMessagesController().e3(0, na2Var.F, true);
                return;
        }
    }
}

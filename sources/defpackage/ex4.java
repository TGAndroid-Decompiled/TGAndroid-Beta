package defpackage;
public final class ex4 implements Runnable {
    public final byte a;
    public final yx4 b;
    public final pcc c;

    public ex4(yx4 yx4Var, pcc pccVar, byte b) {
        this.a = b;
        this.b = yx4Var;
        this.c = pccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.c;
        yx4 yx4Var = this.b;
        switch (b) {
            case 0:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                return;
            case 1:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                return;
            default:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                return;
        }
    }
}

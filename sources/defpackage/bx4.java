package defpackage;
public final class bx4 implements Runnable {
    public final byte a;
    public final ux4 b;
    public final qac c;

    public bx4(ux4 ux4Var, qac qacVar, byte b) {
        this.a = b;
        this.b = ux4Var;
        this.c = qacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qac qacVar = this.c;
        ux4 ux4Var = this.b;
        switch (b) {
            case 0:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                return;
            case 1:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                return;
            default:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                return;
        }
    }
}

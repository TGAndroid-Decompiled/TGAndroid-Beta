package defpackage;
public final class cwa implements Runnable {
    public final byte a;
    public final qe2 b;

    public cwa(qe2 qe2Var, byte b) {
        this.a = b;
        this.b = qe2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qe2 qe2Var = this.b;
        switch (b) {
            case 0:
                qe2Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                qe2Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                qe2Var.a(Boolean.FALSE, null);
                return;
            default:
                hl.c3(new cwa(qe2Var, (byte) 2));
                return;
        }
    }
}

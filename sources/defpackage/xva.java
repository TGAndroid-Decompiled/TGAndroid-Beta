package defpackage;
public final class xva implements Runnable {
    public final byte a;
    public final iv4 b;

    public xva(iv4 iv4Var, byte b) {
        this.a = b;
        this.b = iv4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        iv4 iv4Var = this.b;
        switch (b) {
            case 0:
                iv4Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                iv4Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                hl.c3(new xva(iv4Var, (byte) 3));
                return;
            default:
                iv4Var.a(Boolean.FALSE, null);
                return;
        }
    }
}

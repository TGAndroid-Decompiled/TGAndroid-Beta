package defpackage;
public final class xta implements Runnable {
    public final byte a;
    public final fv4 b;

    public xta(fv4 fv4Var, byte b) {
        this.a = b;
        this.b = fv4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fv4 fv4Var = this.b;
        switch (b) {
            case 0:
                fv4Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                fv4Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                gm.c3(new xta(fv4Var, (byte) 3));
                return;
            default:
                fv4Var.a(Boolean.FALSE, null);
                return;
        }
    }
}

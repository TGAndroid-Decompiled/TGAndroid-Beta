package defpackage;
public final class rta implements Runnable {
    public final byte a;
    public final lf2 b;

    public rta(lf2 lf2Var, byte b) {
        this.a = b;
        this.b = lf2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lf2 lf2Var = this.b;
        switch (b) {
            case 0:
                lf2Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                lf2Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                gm.c3(new rta(lf2Var, (byte) 3));
                return;
            default:
                lf2Var.a(Boolean.FALSE, null);
                return;
        }
    }
}

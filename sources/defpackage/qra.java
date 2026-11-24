package defpackage;
public final class qra implements Runnable {
    public final byte a;
    public final ae2 b;

    public qra(ae2 ae2Var, byte b) {
        this.a = b;
        this.b = ae2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ae2 ae2Var = this.b;
        switch (b) {
            case 0:
                ae2Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                ae2Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                gl.c3(new qra(ae2Var, (byte) 3));
                return;
            default:
                ae2Var.a(Boolean.FALSE, null);
                return;
        }
    }
}

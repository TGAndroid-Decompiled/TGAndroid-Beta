package defpackage;
public final class vra implements Runnable {
    public final byte a;
    public final et4 b;

    public vra(et4 et4Var, byte b) {
        this.a = b;
        this.b = et4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        et4 et4Var = this.b;
        switch (b) {
            case 0:
                et4Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                et4Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                gl.d3(new vra(et4Var, (byte) 3));
                return;
            default:
                et4Var.a(Boolean.FALSE, null);
                return;
        }
    }
}

package di;
public final class x6 implements Runnable {
    public final int f10005a;
    public final org.telegram.ui.Wallet.f0 f10006b;

    public x6(org.telegram.ui.Wallet.f0 f0Var, int i7) {
        this.f10005a = i7;
        this.f10006b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f10005a) {
            case 0:
                this.f10006b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f10006b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new x6(this.f10006b, 3));
                return;
            default:
                this.f10006b.a(Boolean.FALSE, null);
                return;
        }
    }
}

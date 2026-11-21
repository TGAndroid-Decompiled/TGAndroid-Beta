package di;
public final class x6 implements Runnable {
    public final int f10041a;
    public final org.telegram.ui.Wallet.e0 f10042b;

    public x6(org.telegram.ui.Wallet.e0 e0Var, int i7) {
        this.f10041a = i7;
        this.f10042b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f10041a) {
            case 0:
                this.f10042b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f10042b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new x6(this.f10042b, 3));
                return;
            default:
                this.f10042b.a(Boolean.FALSE, null);
                return;
        }
    }
}

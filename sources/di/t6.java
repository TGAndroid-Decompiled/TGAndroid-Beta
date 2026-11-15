package di;
public final class t6 implements Runnable {
    public final int f9470a;
    public final org.telegram.ui.Wallet.t1 f9471b;

    public t6(org.telegram.ui.Wallet.t1 t1Var, int i7) {
        this.f9470a = i7;
        this.f9471b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f9470a) {
            case 0:
                this.f9471b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f9471b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new t6(this.f9471b, 3));
                return;
            default:
                this.f9471b.a(Boolean.FALSE, null);
                return;
        }
    }
}

package bi;
public final class b8 implements Runnable {
    public final int f3517a;
    public final org.telegram.ui.Wallet.t1 f3518b;

    public b8(org.telegram.ui.Wallet.t1 t1Var, int i7) {
        this.f3517a = i7;
        this.f3518b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f3517a) {
            case 0:
                this.f3518b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f3518b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new b8(this.f3518b, 3));
                return;
            default:
                this.f3518b.a(Boolean.FALSE, null);
                return;
        }
    }
}

package di;
public final class w6 implements Runnable {
    public final int f9968a;
    public final org.telegram.ui.Wallet.e0 f9969b;

    public w6(org.telegram.ui.Wallet.e0 e0Var, int i7) {
        this.f9968a = i7;
        this.f9969b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f9968a) {
            case 0:
                this.f9969b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f9969b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new w6(this.f9969b, 3));
                return;
            default:
                this.f9969b.a(Boolean.FALSE, null);
                return;
        }
    }
}

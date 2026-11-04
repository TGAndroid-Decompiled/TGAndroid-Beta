package ci;
public final class c7 implements Runnable {
    public final int f4917a;
    public final org.telegram.ui.Wallet.s1 f4918b;

    public c7(org.telegram.ui.Wallet.s1 s1Var, int i3) {
        this.f4917a = i3;
        this.f4918b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f4917a) {
            case 0:
                this.f4918b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f4918b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new c7(this.f4918b, 3));
                return;
            default:
                this.f4918b.a(Boolean.FALSE, null);
                return;
        }
    }
}

package di;

import org.telegram.messenger.q10;
public final class t6 implements Runnable {
    public final int f9810a;
    public final q10 f9811b;

    public t6(q10 q10Var, int i7) {
        this.f9810a = i7;
        this.f9811b = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f9810a) {
            case 0:
                this.f9811b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f9811b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f9811b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.g3(new t6(this.f9811b, 0));
                return;
        }
    }
}

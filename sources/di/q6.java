package di;

import org.telegram.messenger.s10;
public final class q6 implements Runnable {
    public final int f9272a;
    public final s10 f9273b;

    public q6(s10 s10Var, int i7) {
        this.f9272a = i7;
        this.f9273b = s10Var;
    }

    @Override
    public final void run() {
        switch (this.f9272a) {
            case 0:
                this.f9273b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f9273b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f9273b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.h3(new q6(this.f9273b, 0));
                return;
        }
    }
}

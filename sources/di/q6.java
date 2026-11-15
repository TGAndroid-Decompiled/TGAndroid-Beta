package di;

import org.telegram.messenger.s10;
public final class q6 implements Runnable {
    public final int f9274a;
    public final s10 f9275b;

    public q6(s10 s10Var, int i7) {
        this.f9274a = i7;
        this.f9275b = s10Var;
    }

    @Override
    public final void run() {
        switch (this.f9274a) {
            case 0:
                this.f9275b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f9275b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f9275b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.h3(new q6(this.f9275b, 0));
                return;
        }
    }
}

package di;

import org.telegram.messenger.q10;
public final class t6 implements Runnable {
    public final int f9813a;
    public final q10 f9814b;

    public t6(q10 q10Var, int i7) {
        this.f9813a = i7;
        this.f9814b = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f9813a) {
            case 0:
                this.f9814b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f9814b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f9814b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.g3(new t6(this.f9814b, 0));
                return;
        }
    }
}

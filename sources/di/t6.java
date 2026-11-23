package di;

import org.telegram.messenger.r10;
public final class t6 implements Runnable {
    public final int f9795a;
    public final r10 f9796b;

    public t6(r10 r10Var, int i7) {
        this.f9795a = i7;
        this.f9796b = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f9795a) {
            case 0:
                this.f9796b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f9796b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f9796b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.g3(new t6(this.f9796b, 0));
                return;
        }
    }
}

package bi;

import org.telegram.messenger.v10;
public final class y7 implements Runnable {
    public final int f5078a;
    public final v10 f5079b;

    public y7(v10 v10Var, int i7) {
        this.f5078a = i7;
        this.f5079b = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f5078a) {
            case 0:
                this.f5079b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f5079b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f5079b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.h3(new y7(this.f5079b, 0));
                return;
        }
    }
}

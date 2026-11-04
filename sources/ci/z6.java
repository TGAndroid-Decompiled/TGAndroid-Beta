package ci;

import org.telegram.messenger.n10;
public final class z6 implements Runnable {
    public final int f6463a;
    public final n10 f6464b;

    public z6(n10 n10Var, int i3) {
        this.f6463a = i3;
        this.f6464b = n10Var;
    }

    @Override
    public final void run() {
        switch (this.f6463a) {
            case 0:
                this.f6464b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f6464b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f6464b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.h3(new z6(this.f6464b, 0));
                return;
        }
    }
}

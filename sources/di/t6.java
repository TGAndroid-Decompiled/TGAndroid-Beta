package di;

import org.telegram.messenger.p10;
public final class t6 implements Runnable {
    public final int f9794a;
    public final p10 f9795b;

    public t6(p10 p10Var, int i7) {
        this.f9794a = i7;
        this.f9795b = p10Var;
    }

    @Override
    public final void run() {
        switch (this.f9794a) {
            case 0:
                this.f9795b.a(Boolean.FALSE, null);
                return;
            case 1:
                this.f9795b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f9795b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.g3(new t6(this.f9795b, 0));
                return;
        }
    }
}

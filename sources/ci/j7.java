package ci;
public final class j7 implements Runnable {
    public final int f5342a;
    public final ai.d6 f5343b;

    public j7(ai.d6 d6Var, int i3) {
        this.f5342a = i3;
        this.f5343b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f5342a) {
            case 0:
                this.f5343b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f5343b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new j7(this.f5343b, 3));
                return;
            default:
                this.f5343b.a(Boolean.FALSE, null);
                return;
        }
    }
}

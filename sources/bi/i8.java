package bi;
public final class i8 implements Runnable {
    public final int f4049a;
    public final mc f4050b;

    public i8(mc mcVar, int i7) {
        this.f4049a = i7;
        this.f4050b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f4049a) {
            case 0:
                this.f4050b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f4050b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new i8(this.f4050b, 3));
                return;
            default:
                this.f4050b.a(Boolean.FALSE, null);
                return;
        }
    }
}

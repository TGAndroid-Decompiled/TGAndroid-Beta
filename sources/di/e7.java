package di;
public final class e7 implements Runnable {
    public final int f8739a;
    public final bi.f8 f8740b;

    public e7(bi.f8 f8Var, int i7) {
        this.f8739a = i7;
        this.f8740b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f8739a) {
            case 0:
                this.f8740b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8740b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new e7(this.f8740b, 3));
                return;
            default:
                this.f8740b.a(Boolean.FALSE, null);
                return;
        }
    }
}

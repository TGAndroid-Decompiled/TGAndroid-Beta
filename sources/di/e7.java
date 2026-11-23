package di;
public final class e7 implements Runnable {
    public final int f8742a;
    public final bi.e8 f8743b;

    public e7(bi.e8 e8Var, int i7) {
        this.f8742a = i7;
        this.f8743b = e8Var;
    }

    @Override
    public final void run() {
        switch (this.f8742a) {
            case 0:
                this.f8743b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8743b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new e7(this.f8743b, 3));
                return;
            default:
                this.f8743b.a(Boolean.FALSE, null);
                return;
        }
    }
}

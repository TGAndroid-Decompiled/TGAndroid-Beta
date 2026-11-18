package di;
public final class e7 implements Runnable {
    public final int f8708a;
    public final bi.c8 f8709b;

    public e7(bi.c8 c8Var, int i7) {
        this.f8708a = i7;
        this.f8709b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f8708a) {
            case 0:
                this.f8709b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8709b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new e7(this.f8709b, 3));
                return;
            default:
                this.f8709b.a(Boolean.FALSE, null);
                return;
        }
    }
}

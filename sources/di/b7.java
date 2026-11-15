package di;
public final class b7 implements Runnable {
    public final int f8252a;
    public final bi.v5 f8253b;

    public b7(bi.v5 v5Var, int i7) {
        this.f8252a = i7;
        this.f8253b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f8252a) {
            case 0:
                this.f8253b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8253b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new b7(this.f8253b, 3));
                return;
            default:
                this.f8253b.a(Boolean.FALSE, null);
                return;
        }
    }
}

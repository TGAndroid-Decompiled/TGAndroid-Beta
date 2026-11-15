package di;
public final class b7 implements Runnable {
    public final int f8255a;
    public final bi.v5 f8256b;

    public b7(bi.v5 v5Var, int i7) {
        this.f8255a = i7;
        this.f8256b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f8255a) {
            case 0:
                this.f8256b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8256b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.h3(new b7(this.f8256b, 3));
                return;
            default:
                this.f8256b.a(Boolean.FALSE, null);
                return;
        }
    }
}

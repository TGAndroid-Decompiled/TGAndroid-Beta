package di;
public final class e7 implements Runnable {
    public final int f8705a;
    public final bi.h8 f8706b;

    public e7(bi.h8 h8Var, int i7) {
        this.f8705a = i7;
        this.f8706b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f8705a) {
            case 0:
                this.f8706b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8706b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new e7(this.f8706b, 3));
                return;
            default:
                this.f8706b.a(Boolean.FALSE, null);
                return;
        }
    }
}

package di;
public final class e7 implements Runnable {
    public final int f8703a;
    public final bi.h8 f8704b;

    public e7(bi.h8 h8Var, int i7) {
        this.f8703a = i7;
        this.f8704b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f8703a) {
            case 0:
                this.f8704b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f8704b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                org.telegram.messenger.g0.g3(new e7(this.f8704b, 3));
                return;
            default:
                this.f8704b.a(Boolean.FALSE, null);
                return;
        }
    }
}

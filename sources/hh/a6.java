package hh;

import org.telegram.messenger.AndroidUtilities;

public final class a6 implements Runnable {

    public final int f8954a;

    public final gh.p5 f8955b;

    public a6(gh.p5 p5Var, int i10) {
        this.f8954a = i10;
        this.f8955b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f8954a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a6(this.f8955b, 3));
                break;
            case 1:
                this.f8955b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.f8955b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                this.f8955b.run(Boolean.FALSE, null);
                break;
        }
    }
}

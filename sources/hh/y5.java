package hh;

import org.telegram.messenger.AndroidUtilities;

public final class y5 implements Runnable {

    public final int f10382a;

    public final cg.u0 f10383b;

    public y5(cg.u0 u0Var, int i10) {
        this.f10382a = i10;
        this.f10383b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f10382a) {
            case 0:
                this.f10383b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.f10383b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new y5(this.f10383b, 3));
                break;
            default:
                this.f10383b.run(Boolean.FALSE, null);
                break;
        }
    }
}

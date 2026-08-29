package jh;

import org.telegram.messenger.AndroidUtilities;
public final class y5 implements Runnable {
    public final int f13126a;
    public final ih.i5 f13127b;

    public y5(ih.i5 i5Var, int i10) {
        this.f13126a = i10;
        this.f13127b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f13126a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y5(this.f13127b, 3));
                return;
            case 1:
                this.f13127b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f13127b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f13127b.run(Boolean.FALSE, null);
                return;
        }
    }
}

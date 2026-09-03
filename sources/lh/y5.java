package lh;

import org.telegram.messenger.AndroidUtilities;
public final class y5 implements Runnable {
    public final int f13378a;
    public final kh.h5 f13379b;

    public y5(kh.h5 h5Var, int i10) {
        this.f13378a = i10;
        this.f13379b = h5Var;
    }

    @Override
    public final void run() {
        switch (this.f13378a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y5(this.f13379b, 3));
                return;
            case 1:
                this.f13379b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f13379b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f13379b.run(Boolean.FALSE, null);
                return;
        }
    }
}

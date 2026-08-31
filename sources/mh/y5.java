package mh;

import org.telegram.messenger.AndroidUtilities;
public final class y5 implements Runnable {
    public final int f15096a;
    public final lh.i5 f15097b;

    public y5(lh.i5 i5Var, int i10) {
        this.f15096a = i10;
        this.f15097b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f15096a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y5(this.f15097b, 3));
                return;
            case 1:
                this.f15097b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f15097b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f15097b.run(Boolean.FALSE, null);
                return;
        }
    }
}

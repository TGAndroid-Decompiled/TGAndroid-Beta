package mh;

import org.telegram.messenger.AndroidUtilities;
public final class y5 implements Runnable {
    public final int f15098a;
    public final lh.i5 f15099b;

    public y5(lh.i5 i5Var, int i10) {
        this.f15098a = i10;
        this.f15099b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f15098a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y5(this.f15099b, 3));
                return;
            case 1:
                this.f15099b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f15099b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f15099b.run(Boolean.FALSE, null);
                return;
        }
    }
}

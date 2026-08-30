package lh;

import org.telegram.messenger.AndroidUtilities;
public final class y5 implements Runnable {
    public final int f13394a;
    public final kh.i5 f13395b;

    public y5(kh.i5 i5Var, int i10) {
        this.f13394a = i10;
        this.f13395b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f13394a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y5(this.f13395b, 3));
                return;
            case 1:
                this.f13395b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f13395b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f13395b.run(Boolean.FALSE, null);
                return;
        }
    }
}

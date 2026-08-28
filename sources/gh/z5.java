package gh;

import org.telegram.messenger.AndroidUtilities;
public final class z5 implements Runnable {
    public final int f9256a;
    public final bg.y0 f9257b;

    public z5(bg.y0 y0Var, int i9) {
        this.f9256a = i9;
        this.f9257b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f9256a) {
            case 0:
                this.f9257b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f9257b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new z5(this.f9257b, 3));
                return;
            default:
                this.f9257b.run(Boolean.FALSE, null);
                return;
        }
    }
}

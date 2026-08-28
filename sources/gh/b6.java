package gh;

import org.telegram.messenger.AndroidUtilities;
public final class b6 implements Runnable {
    public final int f7855a;
    public final fh.w5 f7856b;

    public b6(fh.w5 w5Var, int i9) {
        this.f7855a = i9;
        this.f7856b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f7855a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b6(this.f7856b, 3));
                return;
            case 1:
                this.f7856b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f7856b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f7856b.run(Boolean.FALSE, null);
                return;
        }
    }
}

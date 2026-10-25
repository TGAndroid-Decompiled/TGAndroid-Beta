package bi;

import org.telegram.messenger.AndroidUtilities;
public final class d8 implements Runnable {
    public final int f4497a;
    public final lc f4498b;

    public d8(lc lcVar, int i10) {
        this.f4497a = i10;
        this.f4498b = lcVar;
    }

    @Override
    public final void run() {
        switch (this.f4497a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d8(this.f4498b, 3));
                return;
            case 1:
                this.f4498b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f4498b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f4498b.run(Boolean.FALSE, null);
                return;
        }
    }
}

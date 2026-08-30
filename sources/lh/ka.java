package lh;

import org.telegram.messenger.AndroidUtilities;
public final class ka implements Runnable {
    public final int f12737a;
    public final eb f12738b;

    public ka(eb ebVar, int i10) {
        this.f12737a = i10;
        this.f12738b = ebVar;
    }

    @Override
    public final void run() {
        switch (this.f12737a) {
            case 0:
                eb ebVar = this.f12738b;
                ebVar.O = true;
                ebVar.o(null);
                AndroidUtilities.runOnUIThread(new ka(ebVar, 1), 240L);
                return;
            case 1:
                this.f12738b.dismiss();
                return;
            default:
                qa qaVar = this.f12738b.f12384r;
                qaVar.C = false;
                qaVar.invalidate();
                return;
        }
    }
}

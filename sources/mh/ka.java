package mh;

import org.telegram.messenger.AndroidUtilities;
public final class ka implements Runnable {
    public final int f14370a;
    public final eb f14371b;

    public ka(eb ebVar, int i10) {
        this.f14370a = i10;
        this.f14371b = ebVar;
    }

    @Override
    public final void run() {
        switch (this.f14370a) {
            case 0:
                eb ebVar = this.f14371b;
                ebVar.O = true;
                ebVar.o(null);
                AndroidUtilities.runOnUIThread(new ka(ebVar, 1), 240L);
                return;
            case 1:
                this.f14371b.dismiss();
                return;
            default:
                qa qaVar = this.f14371b.f13995r;
                qaVar.C = false;
                qaVar.invalidate();
                return;
        }
    }
}

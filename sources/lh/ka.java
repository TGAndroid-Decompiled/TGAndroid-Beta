package lh;

import org.telegram.messenger.AndroidUtilities;
public final class ka implements Runnable {
    public final int f12721a;
    public final eb f12722b;

    public ka(eb ebVar, int i10) {
        this.f12721a = i10;
        this.f12722b = ebVar;
    }

    @Override
    public final void run() {
        switch (this.f12721a) {
            case 0:
                eb ebVar = this.f12722b;
                ebVar.O = true;
                ebVar.o(null);
                AndroidUtilities.runOnUIThread(new ka(ebVar, 1), 240L);
                return;
            case 1:
                this.f12722b.dismiss();
                return;
            default:
                qa qaVar = this.f12722b.f12368r;
                qaVar.C = false;
                qaVar.invalidate();
                return;
        }
    }
}

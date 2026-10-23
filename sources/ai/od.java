package ai;

import org.telegram.messenger.AndroidUtilities;
public final class od implements Runnable {
    public final int f1963a;
    public final me f1964b;

    public od(me meVar, int i10) {
        this.f1963a = i10;
        this.f1964b = meVar;
    }

    @Override
    public final void run() {
        switch (this.f1963a) {
            case 0:
                me meVar = this.f1964b;
                meVar.T = true;
                meVar.p(null);
                AndroidUtilities.runOnUIThread(new od(meVar, 1), 240L);
                return;
            case 1:
                this.f1964b.dismiss();
                return;
            default:
                vd vdVar = this.f1964b.f1844r;
                vdVar.F = false;
                vdVar.invalidate();
                return;
        }
    }
}

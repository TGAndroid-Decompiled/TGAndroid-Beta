package hg;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f10283a;
    public final n f10284b;

    public h(n nVar, int i10) {
        this.f10283a = i10;
        this.f10284b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f10283a) {
            case 0:
                n.Y(this.f10284b);
                return;
            case 1:
                n.Z(this.f10284b);
                return;
            default:
                h hVar = this.f10284b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}

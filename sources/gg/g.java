package gg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f8890a;
    public final n f8891b;

    public g(n nVar, int i10) {
        this.f8890a = i10;
        this.f8891b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f8890a) {
            case 0:
                n.Y(this.f8891b);
                return;
            case 1:
                n.Z(this.f8891b);
                return;
            default:
                g gVar = this.f8891b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

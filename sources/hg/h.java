package hg;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f11205a;
    public final n f11206b;

    public h(n nVar, int i10) {
        this.f11205a = i10;
        this.f11206b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f11205a) {
            case 0:
                n.X(this.f11206b);
                return;
            case 1:
                n.Y(this.f11206b);
                return;
            default:
                h hVar = this.f11206b.f11267e;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}

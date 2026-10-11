package hg;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f11256a;
    public final n f11257b;

    public h(n nVar, int i10) {
        this.f11256a = i10;
        this.f11257b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f11256a) {
            case 0:
                n.Y(this.f11257b);
                return;
            case 1:
                n.Z(this.f11257b);
                return;
            default:
                h hVar = this.f11257b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}

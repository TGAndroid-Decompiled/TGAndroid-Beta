package hg;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f11255a;
    public final n f11256b;

    public h(n nVar, int i10) {
        this.f11255a = i10;
        this.f11256b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f11255a) {
            case 0:
                n.Y(this.f11256b);
                return;
            case 1:
                n.Z(this.f11256b);
                return;
            default:
                h hVar = this.f11256b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}

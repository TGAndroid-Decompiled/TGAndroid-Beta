package hg;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f10297a;
    public final n f10298b;

    public h(n nVar, int i10) {
        this.f10297a = i10;
        this.f10298b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f10297a) {
            case 0:
                n.Y(this.f10298b);
                return;
            case 1:
                n.Z(this.f10298b);
                return;
            default:
                h hVar = this.f10298b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}

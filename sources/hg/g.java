package hg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f10290a;
    public final m f10291b;

    public g(m mVar, int i10) {
        this.f10290a = i10;
        this.f10291b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10290a) {
            case 0:
                m.Y(this.f10291b);
                return;
            case 1:
                m.Z(this.f10291b);
                return;
            default:
                g gVar = this.f10291b.e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

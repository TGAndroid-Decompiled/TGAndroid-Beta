package hg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f10283a;
    public final m f10284b;

    public g(m mVar, int i10) {
        this.f10283a = i10;
        this.f10284b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10283a) {
            case 0:
                m.Y(this.f10284b);
                return;
            case 1:
                m.Z(this.f10284b);
                return;
            default:
                g gVar = this.f10284b.e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

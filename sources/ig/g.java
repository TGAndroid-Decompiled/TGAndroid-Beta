package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f12900a;
    public final m f12901b;

    public g(m mVar, int i10) {
        this.f12900a = i10;
        this.f12901b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f12900a) {
            case 0:
                m.Y(this.f12901b);
                return;
            case 1:
                m.Z(this.f12901b);
                return;
            default:
                g gVar = this.f12901b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

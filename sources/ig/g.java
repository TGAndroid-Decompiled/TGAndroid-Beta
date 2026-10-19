package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f12902a;
    public final m f12903b;

    public g(m mVar, int i10) {
        this.f12902a = i10;
        this.f12903b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f12902a) {
            case 0:
                m.Y(this.f12903b);
                return;
            case 1:
                m.Z(this.f12903b);
                return;
            default:
                g gVar = this.f12903b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

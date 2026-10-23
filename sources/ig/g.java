package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f12931a;
    public final m f12932b;

    public g(m mVar, int i10) {
        this.f12931a = i10;
        this.f12932b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f12931a) {
            case 0:
                m.Y(this.f12932b);
                return;
            case 1:
                m.Z(this.f12932b);
                return;
            default:
                g gVar = this.f12932b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

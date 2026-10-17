package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f12904a;
    public final m f12905b;

    public g(m mVar, int i10) {
        this.f12904a = i10;
        this.f12905b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f12904a) {
            case 0:
                m.Y(this.f12905b);
                return;
            case 1:
                m.Z(this.f12905b);
                return;
            default:
                g gVar = this.f12905b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

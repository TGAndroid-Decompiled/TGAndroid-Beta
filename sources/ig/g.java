package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f12074a;
    public final m f12075b;

    public g(m mVar, int i10) {
        this.f12074a = i10;
        this.f12075b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f12074a) {
            case 0:
                m.Y(this.f12075b);
                return;
            case 1:
                m.Z(this.f12075b);
                return;
            default:
                g gVar = this.f12075b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

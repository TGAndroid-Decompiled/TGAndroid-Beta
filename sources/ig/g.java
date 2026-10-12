package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f11508a;
    public final m f11509b;

    public g(m mVar, int i10) {
        this.f11508a = i10;
        this.f11509b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11508a) {
            case 0:
                m.Y(this.f11509b);
                return;
            case 1:
                m.Z(this.f11509b);
                return;
            default:
                g gVar = this.f11509b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

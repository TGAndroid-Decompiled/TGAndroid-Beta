package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f11512a;
    public final m f11513b;

    public g(m mVar, int i10) {
        this.f11512a = i10;
        this.f11513b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11512a) {
            case 0:
                m.Y(this.f11513b);
                return;
            case 1:
                m.Z(this.f11513b);
                return;
            default:
                g gVar = this.f11513b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

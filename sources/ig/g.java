package ig;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f12100a;
    public final m f12101b;

    public g(m mVar, int i10) {
        this.f12100a = i10;
        this.f12101b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f12100a) {
            case 0:
                m.Y(this.f12101b);
                return;
            case 1:
                m.Z(this.f12101b);
                return;
            default:
                g gVar = this.f12101b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

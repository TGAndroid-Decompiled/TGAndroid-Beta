package hg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f11197a;
    public final m f11198b;

    public g(m mVar, int i10) {
        this.f11197a = i10;
        this.f11198b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11197a) {
            case 0:
                m.X(this.f11198b);
                return;
            case 1:
                m.Y(this.f11198b);
                return;
            default:
                g gVar = this.f11198b.f11262e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

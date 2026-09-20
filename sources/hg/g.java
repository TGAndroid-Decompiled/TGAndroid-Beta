package hg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f10296a;
    public final m f10297b;

    public g(m mVar, int i10) {
        this.f10296a = i10;
        this.f10297b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10296a) {
            case 0:
                m.Y(this.f10297b);
                return;
            case 1:
                m.Z(this.f10297b);
                return;
            default:
                g gVar = this.f10297b.e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

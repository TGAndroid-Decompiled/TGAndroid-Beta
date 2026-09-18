package hg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f10295a;
    public final m f10296b;

    public g(m mVar, int i10) {
        this.f10295a = i10;
        this.f10296b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10295a) {
            case 0:
                m.Y(this.f10296b);
                return;
            case 1:
                m.Z(this.f10296b);
                return;
            default:
                g gVar = this.f10296b.e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}

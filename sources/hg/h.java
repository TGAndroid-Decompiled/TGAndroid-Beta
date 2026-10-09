package hg;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f11257a;
    public final n f11258b;

    public h(n nVar, int i10) {
        this.f11257a = i10;
        this.f11258b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f11257a) {
            case 0:
                n.Y(this.f11258b);
                return;
            case 1:
                n.Z(this.f11258b);
                return;
            default:
                h hVar = this.f11258b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}

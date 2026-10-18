package ei;

import org.telegram.messenger.AndroidUtilities;
public final class z9 implements Runnable {
    public final int f10247a;
    public final vb f10248b;
    public final Runnable f10249c;

    public z9(vb vbVar, Runnable runnable, int i10) {
        this.f10247a = i10;
        this.f10248b = vbVar;
        this.f10249c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f10247a) {
            case 0:
                this.f10249c.run();
                this.f10248b.o0();
                return;
            default:
                vb vbVar = this.f10248b;
                vbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(vbVar.f9973g2);
                vbVar.f9973g2 = null;
                vbVar.S1 = false;
                this.f10249c.run();
                return;
        }
    }
}

package ei;

import org.telegram.messenger.AndroidUtilities;
public final class z9 implements Runnable {
    public final int f10246a;
    public final vb f10247b;
    public final Runnable f10248c;

    public z9(vb vbVar, Runnable runnable, int i10) {
        this.f10246a = i10;
        this.f10247b = vbVar;
        this.f10248c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f10246a) {
            case 0:
                this.f10248c.run();
                this.f10247b.o0();
                return;
            default:
                vb vbVar = this.f10247b;
                vbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(vbVar.f9972g2);
                vbVar.f9972g2 = null;
                vbVar.S1 = false;
                this.f10248c.run();
                return;
        }
    }
}

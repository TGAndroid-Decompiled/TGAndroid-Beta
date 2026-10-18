package ei;

import org.telegram.messenger.AndroidUtilities;
public final class z9 implements Runnable {
    public final int f10245a;
    public final vb f10246b;
    public final Runnable f10247c;

    public z9(vb vbVar, Runnable runnable, int i10) {
        this.f10245a = i10;
        this.f10246b = vbVar;
        this.f10247c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f10245a) {
            case 0:
                this.f10247c.run();
                this.f10246b.o0();
                return;
            default:
                vb vbVar = this.f10246b;
                vbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(vbVar.f9971g2);
                vbVar.f9971g2 = null;
                vbVar.S1 = false;
                this.f10247c.run();
                return;
        }
    }
}

package ei;

import org.telegram.messenger.AndroidUtilities;
public final class z9 implements Runnable {
    public final int f10244a;
    public final vb f10245b;
    public final Runnable f10246c;

    public z9(vb vbVar, Runnable runnable, int i10) {
        this.f10244a = i10;
        this.f10245b = vbVar;
        this.f10246c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f10244a) {
            case 0:
                this.f10246c.run();
                this.f10245b.o0();
                return;
            default:
                vb vbVar = this.f10245b;
                vbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(vbVar.f9970g2);
                vbVar.f9970g2 = null;
                vbVar.S1 = false;
                this.f10246c.run();
                return;
        }
    }
}

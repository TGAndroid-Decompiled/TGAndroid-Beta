package ei;

import org.telegram.messenger.AndroidUtilities;
public final class z9 implements Runnable {
    public final int f10261a;
    public final vb f10262b;
    public final Runnable f10263c;

    public z9(vb vbVar, Runnable runnable, int i10) {
        this.f10261a = i10;
        this.f10262b = vbVar;
        this.f10263c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f10261a) {
            case 0:
                this.f10263c.run();
                this.f10262b.o0();
                return;
            default:
                vb vbVar = this.f10262b;
                vbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(vbVar.f9987g2);
                vbVar.f9987g2 = null;
                vbVar.S1 = false;
                this.f10263c.run();
                return;
        }
    }
}

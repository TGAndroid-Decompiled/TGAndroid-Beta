package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f13107a;
    public final e f13108b;

    public c(e eVar, int i10) {
        this.f13107a = i10;
        this.f13108b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f13107a) {
            case 0:
                this.f13108b.a();
                return;
            default:
                e eVar = this.f13108b;
                AndroidUtilities.runOnUIThread(eVar.f13128y, 400L);
                eVar.c();
                return;
        }
    }
}

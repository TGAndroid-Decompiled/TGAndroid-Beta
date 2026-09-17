package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f12304a;
    public final e f12305b;

    public c(e eVar, int i10) {
        this.f12304a = i10;
        this.f12305b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f12304a) {
            case 0:
                this.f12305b.a();
                return;
            default:
                e eVar = this.f12305b;
                AndroidUtilities.runOnUIThread(eVar.f12327y, 400L);
                eVar.c();
                return;
        }
    }
}

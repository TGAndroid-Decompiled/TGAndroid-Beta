package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f13146a;
    public final e f13147b;

    public c(e eVar, int i10) {
        this.f13146a = i10;
        this.f13147b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f13146a) {
            case 0:
                this.f13147b.a();
                return;
            default:
                e eVar = this.f13147b;
                AndroidUtilities.runOnUIThread(eVar.f13167y, 400L);
                eVar.c();
                return;
        }
    }
}

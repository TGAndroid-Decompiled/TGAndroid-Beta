package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f13102a;
    public final e f13103b;

    public c(e eVar, int i10) {
        this.f13102a = i10;
        this.f13103b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f13102a) {
            case 0:
                this.f13103b.a();
                return;
            default:
                e eVar = this.f13103b;
                AndroidUtilities.runOnUIThread(eVar.f13123y, 400L);
                eVar.c();
                return;
        }
    }
}

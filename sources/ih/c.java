package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11716a;
    public final e f11717b;

    public c(e eVar, int i10) {
        this.f11716a = i10;
        this.f11717b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11716a) {
            case 0:
                this.f11717b.a();
                return;
            default:
                e eVar = this.f11717b;
                AndroidUtilities.runOnUIThread(eVar.f11737y, 400L);
                eVar.c();
                return;
        }
    }
}

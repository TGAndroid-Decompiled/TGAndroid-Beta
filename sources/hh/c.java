package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f10496a;
    public final e f10497b;

    public c(e eVar, int i10) {
        this.f10496a = i10;
        this.f10497b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10496a) {
            case 0:
                this.f10497b.a();
                return;
            default:
                e eVar = this.f10497b;
                AndroidUtilities.runOnUIThread(eVar.f10517y, 400L);
                eVar.c();
                return;
        }
    }
}

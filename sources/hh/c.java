package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11426a;
    public final e f11427b;

    public c(e eVar, int i10) {
        this.f11426a = i10;
        this.f11427b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11426a) {
            case 0:
                this.f11427b.a();
                return;
            default:
                e eVar = this.f11427b;
                AndroidUtilities.runOnUIThread(eVar.f11449y, 400L);
                eVar.c();
                return;
        }
    }
}

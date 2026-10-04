package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11427a;
    public final e f11428b;

    public c(e eVar, int i10) {
        this.f11427a = i10;
        this.f11428b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11427a) {
            case 0:
                this.f11428b.a();
                return;
            default:
                e eVar = this.f11428b;
                AndroidUtilities.runOnUIThread(eVar.f11450y, 400L);
                eVar.c();
                return;
        }
    }
}

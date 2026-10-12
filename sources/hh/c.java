package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11474a;
    public final e f11475b;

    public c(e eVar, int i10) {
        this.f11474a = i10;
        this.f11475b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11474a) {
            case 0:
                this.f11475b.a();
                return;
            default:
                e eVar = this.f11475b;
                AndroidUtilities.runOnUIThread(eVar.f11497y, 400L);
                eVar.c();
                return;
        }
    }
}

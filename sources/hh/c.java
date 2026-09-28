package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f10484a;
    public final e f10485b;

    public c(e eVar, int i10) {
        this.f10484a = i10;
        this.f10485b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10484a) {
            case 0:
                this.f10485b.a();
                return;
            default:
                e eVar = this.f10485b;
                AndroidUtilities.runOnUIThread(eVar.f10505y, 400L);
                eVar.c();
                return;
        }
    }
}

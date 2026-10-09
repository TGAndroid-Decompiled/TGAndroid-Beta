package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11476a;
    public final e f11477b;

    public c(e eVar, int i10) {
        this.f11476a = i10;
        this.f11477b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11476a) {
            case 0:
                this.f11477b.a();
                return;
            default:
                e eVar = this.f11477b;
                AndroidUtilities.runOnUIThread(eVar.f11499y, 400L);
                eVar.c();
                return;
        }
    }
}

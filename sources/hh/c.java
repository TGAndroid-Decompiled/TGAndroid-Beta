package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11475a;
    public final e f11476b;

    public c(e eVar, int i10) {
        this.f11475a = i10;
        this.f11476b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11475a) {
            case 0:
                this.f11476b.a();
                return;
            default:
                e eVar = this.f11476b;
                AndroidUtilities.runOnUIThread(eVar.f11498y, 400L);
                eVar.c();
                return;
        }
    }
}

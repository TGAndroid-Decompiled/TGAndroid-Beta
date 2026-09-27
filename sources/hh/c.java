package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f10489a;
    public final e f10490b;

    public c(e eVar, int i10) {
        this.f10489a = i10;
        this.f10490b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10489a) {
            case 0:
                this.f10490b.a();
                return;
            default:
                e eVar = this.f10490b;
                AndroidUtilities.runOnUIThread(eVar.f10510y, 400L);
                eVar.c();
                return;
        }
    }
}

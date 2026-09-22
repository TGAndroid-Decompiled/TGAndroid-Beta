package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f10498a;
    public final e f10499b;

    public c(e eVar, int i10) {
        this.f10498a = i10;
        this.f10499b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10498a) {
            case 0:
                this.f10499b.a();
                return;
            default:
                e eVar = this.f10499b;
                AndroidUtilities.runOnUIThread(eVar.f10519y, 400L);
                eVar.c();
                return;
        }
    }
}

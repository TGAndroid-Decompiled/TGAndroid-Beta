package gh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f9110a;
    public final e f9111b;

    public c(e eVar, int i10) {
        this.f9110a = i10;
        this.f9111b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f9110a) {
            case 0:
                this.f9111b.a();
                return;
            default:
                e eVar = this.f9111b;
                AndroidUtilities.runOnUIThread(eVar.f9131y, 400L);
                eVar.c();
                return;
        }
    }
}

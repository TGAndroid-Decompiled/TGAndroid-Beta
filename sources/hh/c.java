package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f10502a;
    public final e f10503b;

    public c(e eVar, int i10) {
        this.f10502a = i10;
        this.f10503b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10502a) {
            case 0:
                this.f10503b.a();
                return;
            default:
                e eVar = this.f10503b;
                AndroidUtilities.runOnUIThread(eVar.f10523y, 400L);
                eVar.c();
                return;
        }
    }
}

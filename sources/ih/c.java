package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f11720a;
    public final e f11721b;

    public c(e eVar, int i10) {
        this.f11720a = i10;
        this.f11721b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f11720a) {
            case 0:
                this.f11721b.a();
                return;
            default:
                e eVar = this.f11721b;
                AndroidUtilities.runOnUIThread(eVar.f11741y, 400L);
                eVar.c();
                return;
        }
    }
}

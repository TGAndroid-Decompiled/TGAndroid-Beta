package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f13109a;
    public final e f13110b;

    public c(e eVar, int i10) {
        this.f13109a = i10;
        this.f13110b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f13109a) {
            case 0:
                this.f13110b.a();
                return;
            default:
                e eVar = this.f13110b;
                AndroidUtilities.runOnUIThread(eVar.f13130y, 400L);
                eVar.c();
                return;
        }
    }
}

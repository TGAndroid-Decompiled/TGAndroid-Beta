package ih;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f12330a;
    public final e f12331b;

    public c(e eVar, int i10) {
        this.f12330a = i10;
        this.f12331b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f12330a) {
            case 0:
                this.f12331b.a();
                return;
            default:
                e eVar = this.f12331b;
                AndroidUtilities.runOnUIThread(eVar.f12353y, 400L);
                eVar.c();
                return;
        }
    }
}

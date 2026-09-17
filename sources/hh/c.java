package hh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f10501a;
    public final e f10502b;

    public c(e eVar, int i10) {
        this.f10501a = i10;
        this.f10502b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10501a) {
            case 0:
                this.f10502b.a();
                return;
            default:
                e eVar = this.f10502b;
                AndroidUtilities.runOnUIThread(eVar.f10522y, 400L);
                eVar.c();
                return;
        }
    }
}

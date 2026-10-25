package jh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f15921a;
    public final e f15922b;

    public c(e eVar, int i10) {
        this.f15921a = i10;
        this.f15922b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f15921a) {
            case 0:
                this.f15922b.a();
                return;
            default:
                e eVar = this.f15922b;
                AndroidUtilities.runOnUIThread(eVar.f15942y, 400L);
                eVar.c();
                return;
        }
    }
}

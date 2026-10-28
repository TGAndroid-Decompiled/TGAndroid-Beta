package jh;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f15920a;
    public final e f15921b;

    public c(e eVar, int i10) {
        this.f15920a = i10;
        this.f15921b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f15920a) {
            case 0:
                this.f15921b.a();
                return;
            default:
                e eVar = this.f15921b;
                AndroidUtilities.runOnUIThread(eVar.f15941y, 400L);
                eVar.c();
                return;
        }
    }
}

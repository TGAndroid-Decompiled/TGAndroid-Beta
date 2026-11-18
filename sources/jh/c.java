package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17749a;
    public final e f17750b;

    public c(e eVar, int i7) {
        this.f17749a = i7;
        this.f17750b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17749a) {
            case 0:
                this.f17750b.a();
                return;
            default:
                e eVar = this.f17750b;
                g0.h3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

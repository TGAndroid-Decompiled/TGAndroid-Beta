package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17752a;
    public final e f17753b;

    public c(e eVar, int i7) {
        this.f17752a = i7;
        this.f17753b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17752a) {
            case 0:
                this.f17753b.a();
                return;
            default:
                e eVar = this.f17753b;
                g0.h3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

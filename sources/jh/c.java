package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17743a;
    public final e f17744b;

    public c(e eVar, int i7) {
        this.f17743a = i7;
        this.f17744b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17743a) {
            case 0:
                this.f17744b.a();
                return;
            default:
                e eVar = this.f17744b;
                g0.h3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

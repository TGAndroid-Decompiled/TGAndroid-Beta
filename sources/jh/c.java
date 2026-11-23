package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17777a;
    public final e f17778b;

    public c(e eVar, int i7) {
        this.f17777a = i7;
        this.f17778b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17777a) {
            case 0:
                this.f17778b.a();
                return;
            default:
                e eVar = this.f17778b;
                g0.h3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

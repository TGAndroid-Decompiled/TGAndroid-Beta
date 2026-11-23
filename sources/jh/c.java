package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17845a;
    public final e f17846b;

    public c(e eVar, int i7) {
        this.f17845a = i7;
        this.f17846b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                this.f17846b.a();
                return;
            default:
                e eVar = this.f17846b;
                g0.h3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

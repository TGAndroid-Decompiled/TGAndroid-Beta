package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17774a;
    public final e f17775b;

    public c(e eVar, int i7) {
        this.f17774a = i7;
        this.f17775b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17774a) {
            case 0:
                this.f17775b.a();
                return;
            default:
                e eVar = this.f17775b;
                g0.h3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

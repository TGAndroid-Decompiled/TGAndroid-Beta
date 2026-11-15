package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17366a;
    public final e f17367b;

    public c(e eVar, int i7) {
        this.f17366a = i7;
        this.f17367b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17366a) {
            case 0:
                this.f17367b.a();
                return;
            default:
                e eVar = this.f17367b;
                g0.i3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

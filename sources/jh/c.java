package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17011a;
    public final e f17012b;

    public c(e eVar, int i7) {
        this.f17011a = i7;
        this.f17012b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17011a) {
            case 0:
                this.f17012b.a();
                return;
            default:
                e eVar = this.f17012b;
                g0.i3(eVar.D, 400L);
                eVar.c();
                return;
        }
    }
}

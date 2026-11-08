package jh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17014a;
    public final e f17015b;

    public c(e eVar, int i7) {
        this.f17014a = i7;
        this.f17015b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17014a) {
            case 0:
                this.f17015b.a();
                return;
            default:
                e eVar = this.f17015b;
                g0.i3(eVar.D, 400L);
                eVar.c();
                return;
        }
    }
}

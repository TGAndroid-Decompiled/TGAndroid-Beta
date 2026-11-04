package kh;

import org.telegram.messenger.g0;
public final class c implements Runnable {
    public final int f17256a;
    public final e f17257b;

    public c(e eVar, int i3) {
        this.f17256a = i3;
        this.f17257b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17256a) {
            case 0:
                this.f17257b.a();
                return;
            default:
                e eVar = this.f17257b;
                g0.i3(eVar.E, 400L);
                eVar.c();
                return;
        }
    }
}

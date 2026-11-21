package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class c implements Runnable {
    public final int f10315a;
    public final d f10316b;
    public final w0.d f10317c;

    public c(d dVar, w0.d dVar2, int i7) {
        this.f10315a = i7;
        this.f10316b = dVar;
        this.f10317c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f10315a) {
            case 0:
                g gVar = this.f10316b.f10319f;
                if (gVar != null) {
                    gVar.a(this.f10317c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f10316b.f10319f;
                if (gVar2 != null) {
                    Object obj = this.f10317c;
                    if (obj == null) {
                        obj = new w0.c(2, "No provider data returned");
                    }
                    gVar2.a(obj);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}

package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class c implements Runnable {
    public final int f9971a;
    public final d f9972b;
    public final w0.d f9973c;

    public c(d dVar, w0.d dVar2, int i7) {
        this.f9971a = i7;
        this.f9972b = dVar;
        this.f9973c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f9971a) {
            case 0:
                g gVar = this.f9972b.f9975f;
                if (gVar != null) {
                    gVar.a(this.f9973c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f9972b.f9975f;
                if (gVar2 != null) {
                    Object obj = this.f9973c;
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

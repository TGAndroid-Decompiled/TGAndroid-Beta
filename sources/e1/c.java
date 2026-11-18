package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class c implements Runnable {
    public final int f10286a;
    public final d f10287b;
    public final w0.d f10288c;

    public c(d dVar, w0.d dVar2, int i7) {
        this.f10286a = i7;
        this.f10287b = dVar;
        this.f10288c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f10286a) {
            case 0:
                g gVar = this.f10287b.f10290f;
                if (gVar != null) {
                    gVar.a(this.f10288c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f10287b.f10290f;
                if (gVar2 != null) {
                    Object obj = this.f10288c;
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

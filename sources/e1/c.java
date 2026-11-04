package e1;

import kotlin.jvm.internal.j;
import v0.h;
public final class c implements Runnable {
    public final int f9319a;
    public final d f9320b;
    public final w0.d f9321c;

    public c(d dVar, w0.d dVar2, int i3) {
        this.f9319a = i3;
        this.f9320b = dVar;
        this.f9321c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f9319a) {
            case 0:
                h hVar = this.f9320b.f9323f;
                if (hVar != null) {
                    hVar.a(this.f9321c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f9320b.f9323f;
                if (hVar2 != null) {
                    Object obj = this.f9321c;
                    if (obj == null) {
                        obj = new w0.c(2, "No provider data returned");
                    }
                    hVar2.a(obj);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}

package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class c implements Runnable {
    public final int f10140a;
    public final d f10141b;
    public final w0.d f10142c;

    public c(d dVar, w0.d dVar2, int i7) {
        this.f10140a = i7;
        this.f10141b = dVar;
        this.f10142c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f10140a) {
            case 0:
                g gVar = this.f10141b.f10144f;
                if (gVar != null) {
                    gVar.a(this.f10142c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f10141b.f10144f;
                if (gVar2 != null) {
                    Object obj = this.f10142c;
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

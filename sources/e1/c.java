package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class c implements Runnable {
    public final int f10279a;
    public final d f10280b;
    public final w0.d f10281c;

    public c(d dVar, w0.d dVar2, int i7) {
        this.f10279a = i7;
        this.f10280b = dVar;
        this.f10281c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f10279a) {
            case 0:
                g gVar = this.f10280b.f10283f;
                if (gVar != null) {
                    gVar.T(this.f10281c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f10280b.f10283f;
                if (gVar2 != null) {
                    Object obj = this.f10281c;
                    if (obj == null) {
                        obj = new w0.c(2, "No provider data returned");
                    }
                    gVar2.T(obj);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}

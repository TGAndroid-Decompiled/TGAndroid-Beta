package d1;

import kotlin.jvm.internal.j;
public final class d implements Runnable {
    public final int f7936a;
    public final e f7937b;

    public d(e eVar, int i7) {
        this.f7936a = i7;
        this.f7937b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7936a) {
            case 0:
                v0.g gVar = this.f7937b.f7939f;
                if (gVar != null) {
                    gVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7937b.f7939f;
                if (gVar2 != null) {
                    gVar2.a(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

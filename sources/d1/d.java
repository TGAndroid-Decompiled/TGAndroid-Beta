package d1;

import kotlin.jvm.internal.j;
public final class d implements Runnable {
    public final int f7602a;
    public final e f7603b;

    public d(e eVar, int i7) {
        this.f7602a = i7;
        this.f7603b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7602a) {
            case 0:
                v0.g gVar = this.f7603b.f7605f;
                if (gVar != null) {
                    gVar.T(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7603b.f7605f;
                if (gVar2 != null) {
                    gVar2.T(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

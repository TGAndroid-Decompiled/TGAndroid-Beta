package d1;

import kotlin.jvm.internal.j;
public final class d implements Runnable {
    public final int f7611a;
    public final e f7612b;

    public d(e eVar, int i7) {
        this.f7611a = i7;
        this.f7612b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7611a) {
            case 0:
                v0.g gVar = this.f7612b.f7614f;
                if (gVar != null) {
                    gVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7612b.f7614f;
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

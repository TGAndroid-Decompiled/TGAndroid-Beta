package d1;

import kotlin.jvm.internal.j;
import v0.h;
public final class d implements Runnable {
    public final int f7993a;
    public final e f7994b;

    public d(e eVar, int i3) {
        this.f7993a = i3;
        this.f7994b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7993a) {
            case 0:
                h hVar = this.f7994b.f7996f;
                if (hVar != null) {
                    hVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f7994b.f7996f;
                if (hVar2 != null) {
                    hVar2.a(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

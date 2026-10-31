package d1;

import kotlin.jvm.internal.i;
import v0.h;
public final class d implements Runnable {
    public final int f5636a;
    public final f f5637b;

    public d(f fVar, int i10) {
        this.f5636a = i10;
        this.f5637b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f5636a) {
            case 0:
                h hVar = this.f5637b.f5641f;
                if (hVar != null) {
                    hVar.g(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f5637b.f5641f;
                if (hVar2 != null) {
                    hVar2.g(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
        }
    }
}

package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class d implements Runnable {
    public final int f4093a;
    public final e f4094b;

    public d(e eVar, int i10) {
        this.f4093a = i10;
        this.f4094b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f4093a) {
            case 0:
                i iVar = this.f4094b.f4095f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4094b.f4095f;
                if (iVar2 != null) {
                    iVar2.onError(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

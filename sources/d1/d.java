package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class d implements Runnable {
    public final int f4074a;
    public final e f4075b;

    public d(e eVar, int i10) {
        this.f4074a = i10;
        this.f4075b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f4074a) {
            case 0:
                i iVar = this.f4075b.f4076f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4075b.f4076f;
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

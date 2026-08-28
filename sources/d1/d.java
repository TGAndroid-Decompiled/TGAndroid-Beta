package d1;

import v0.i;
public final class d implements Runnable {
    public final int f4247a;
    public final e f4248b;

    public d(e eVar, int i9) {
        this.f4247a = i9;
        this.f4248b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f4247a) {
            case 0:
                i iVar = this.f4248b.f4250f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4248b.f4250f;
                if (iVar2 != null) {
                    iVar2.onError(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

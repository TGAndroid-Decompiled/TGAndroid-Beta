package d1;

import v0.i;
public final class d implements Runnable {
    public final int f6463a;
    public final e f6464b;

    public d(e eVar, int i10) {
        this.f6463a = i10;
        this.f6464b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f6463a) {
            case 0:
                i iVar = this.f6464b.f6466f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f6464b.f6466f;
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

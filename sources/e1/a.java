package e1;

import v0.i;
public final class a implements Runnable {
    public final int f8735a;
    public final d f8736b;

    public a(d dVar, int i10) {
        this.f8735a = i10;
        this.f8736b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8735a) {
            case 0:
                i iVar = this.f8736b.f8745f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8736b.f8745f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c("No provider data returned.", 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

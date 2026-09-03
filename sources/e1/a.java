package e1;

import kotlin.jvm.internal.j;
import v0.i;
public final class a implements Runnable {
    public final int f5049a;
    public final d f5050b;

    public a(d dVar, int i10) {
        this.f5049a = i10;
        this.f5050b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f5049a) {
            case 0:
                i iVar = this.f5050b.f5057f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f5050b.f5057f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c("No provider data returned.", 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

package e1;

import kotlin.jvm.internal.i;
import v0.h;
public final class a implements Runnable {
    public final int f6089a;
    public final d f6090b;

    public a(d dVar, int i10) {
        this.f6089a = i10;
        this.f6090b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f6089a) {
            case 0:
                h hVar = this.f6090b.f6097f;
                if (hVar != null) {
                    hVar.g(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f6090b.f6097f;
                if (hVar2 != null) {
                    hVar2.g(new w0.c(2, "No provider data returned."));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
        }
    }
}

package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class a implements Runnable {
    public final int f9965a;
    public final d f9966b;

    public a(d dVar, int i7) {
        this.f9965a = i7;
        this.f9966b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f9965a) {
            case 0:
                g gVar = this.f9966b.f9975f;
                if (gVar != null) {
                    gVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f9966b.f9975f;
                if (gVar2 != null) {
                    gVar2.a(new w0.c(2, "No provider data returned."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

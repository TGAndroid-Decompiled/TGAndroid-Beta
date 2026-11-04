package e1;

import kotlin.jvm.internal.j;
import v0.h;
public final class a implements Runnable {
    public final int f9313a;
    public final d f9314b;

    public a(d dVar, int i3) {
        this.f9313a = i3;
        this.f9314b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f9313a) {
            case 0:
                h hVar = this.f9314b.f9323f;
                if (hVar != null) {
                    hVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f9314b.f9323f;
                if (hVar2 != null) {
                    hVar2.a(new w0.c(2, "No provider data returned."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

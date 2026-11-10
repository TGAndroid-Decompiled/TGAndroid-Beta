package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class a implements Runnable {
    public final int f10134a;
    public final d f10135b;

    public a(d dVar, int i7) {
        this.f10134a = i7;
        this.f10135b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f10134a) {
            case 0:
                g gVar = this.f10135b.f10144f;
                if (gVar != null) {
                    gVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f10135b.f10144f;
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

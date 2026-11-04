package d1;

import kotlin.jvm.internal.j;
import v0.h;
public final class c implements Runnable {
    public final int f7990a;
    public final e f7991b;
    public final Throwable f7992c;

    public c(e eVar, Throwable th2, int i3) {
        this.f7990a = i3;
        this.f7991b = eVar;
        this.f7992c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7990a) {
            case 0:
                h hVar = this.f7991b.f7996f;
                if (hVar != null) {
                    hVar.a(new y0.a(new x0.a(26), this.f7992c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f7991b.f7996f;
                if (hVar2 != null) {
                    hVar2.a(new w0.c(2, this.f7992c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

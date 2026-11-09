package d1;

import kotlin.jvm.internal.j;
public final class c implements Runnable {
    public final int f7933a;
    public final e f7934b;
    public final Throwable f7935c;

    public c(e eVar, Throwable th2, int i7) {
        this.f7933a = i7;
        this.f7934b = eVar;
        this.f7935c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7933a) {
            case 0:
                v0.g gVar = this.f7934b.f7939f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(26), this.f7935c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7934b.f7939f;
                if (gVar2 != null) {
                    gVar2.a(new w0.c(2, this.f7935c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

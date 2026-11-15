package d1;

import kotlin.jvm.internal.j;
public final class c implements Runnable {
    public final int f7322a;
    public final e f7323b;
    public final Throwable f7324c;

    public c(e eVar, Throwable th2, int i7) {
        this.f7322a = i7;
        this.f7323b = eVar;
        this.f7324c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7322a) {
            case 0:
                v0.g gVar = this.f7323b.f7328f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(26), this.f7324c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7323b.f7328f;
                if (gVar2 != null) {
                    gVar2.a(new w0.c(2, this.f7324c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

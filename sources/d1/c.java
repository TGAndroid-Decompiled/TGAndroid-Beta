package d1;

import kotlin.jvm.internal.j;
public final class c implements Runnable {
    public final int f7599a;
    public final e f7600b;
    public final Throwable f7601c;

    public c(e eVar, Throwable th2, int i7) {
        this.f7599a = i7;
        this.f7600b = eVar;
        this.f7601c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7599a) {
            case 0:
                v0.g gVar = this.f7600b.f7605f;
                if (gVar != null) {
                    gVar.T(new y0.a(new x0.a(26), this.f7601c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7600b.f7605f;
                if (gVar2 != null) {
                    gVar2.T(new w0.c(2, this.f7601c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

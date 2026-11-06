package d1;

import kotlin.jvm.internal.j;
public final class c implements Runnable {
    public final int f7935a;
    public final e f7936b;
    public final Throwable f7937c;

    public c(e eVar, Throwable th2, int i7) {
        this.f7935a = i7;
        this.f7936b = eVar;
        this.f7937c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7935a) {
            case 0:
                v0.g gVar = this.f7936b.f7941f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(26), this.f7937c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7936b.f7941f;
                if (gVar2 != null) {
                    gVar2.a(new w0.c(2, this.f7937c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

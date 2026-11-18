package d1;

import kotlin.jvm.internal.j;
public final class c implements Runnable {
    public final int f7605a;
    public final e f7606b;
    public final Throwable f7607c;

    public c(e eVar, Throwable th2, int i7) {
        this.f7605a = i7;
        this.f7606b = eVar;
        this.f7607c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7605a) {
            case 0:
                v0.g gVar = this.f7606b.f7611f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(26), this.f7607c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7606b.f7611f;
                if (gVar2 != null) {
                    gVar2.a(new w0.c(2, this.f7607c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

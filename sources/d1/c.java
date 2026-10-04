package d1;

import v0.i;
public final class c implements Runnable {
    public final int f7989a;
    public final e f7990b;
    public final Throwable f7991c;

    public c(e eVar, Throwable th2, int i10) {
        this.f7989a = i10;
        this.f7990b = eVar;
        this.f7991c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7989a) {
            case 0:
                i iVar = this.f7990b.f7995f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f7991c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7990b.f7995f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f7991c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

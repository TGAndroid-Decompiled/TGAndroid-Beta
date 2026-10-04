package d1;

import v0.i;
public final class c implements Runnable {
    public final int f7990a;
    public final e f7991b;
    public final Throwable f7992c;

    public c(e eVar, Throwable th2, int i10) {
        this.f7990a = i10;
        this.f7991b = eVar;
        this.f7992c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7990a) {
            case 0:
                i iVar = this.f7991b.f7996f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f7992c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7991b.f7996f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f7992c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

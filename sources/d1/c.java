package d1;

import v0.i;
public final class c implements Runnable {
    public final int f8036a;
    public final e f8037b;
    public final Throwable f8038c;

    public c(e eVar, Throwable th2, int i10) {
        this.f8036a = i10;
        this.f8037b = eVar;
        this.f8038c = th2;
    }

    @Override
    public final void run() {
        switch (this.f8036a) {
            case 0:
                i iVar = this.f8037b.f8042f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f8038c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8037b.f8042f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f8038c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

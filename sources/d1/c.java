package d1;

import v0.i;
public final class c implements Runnable {
    public final int f7827a;
    public final e f7828b;
    public final Throwable f7829c;

    public c(e eVar, Throwable th2, int i10) {
        this.f7827a = i10;
        this.f7828b = eVar;
        this.f7829c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7827a) {
            case 0:
                i iVar = this.f7828b.f7832f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f7829c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7828b.f7832f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f7829c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

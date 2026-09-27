package d1;

import v0.i;
public final class c implements Runnable {
    public final int f7389a;
    public final e f7390b;
    public final Throwable f7391c;

    public c(e eVar, Throwable th2, int i10) {
        this.f7389a = i10;
        this.f7390b = eVar;
        this.f7391c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7389a) {
            case 0:
                i iVar = this.f7390b.f7394f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f7391c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7390b.f7394f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f7391c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

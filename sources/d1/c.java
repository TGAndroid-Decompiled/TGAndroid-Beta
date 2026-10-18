package d1;

import v0.i;
public final class c implements Runnable {
    public final int f7724a;
    public final e f7725b;
    public final Throwable f7726c;

    public c(e eVar, Throwable th2, int i10) {
        this.f7724a = i10;
        this.f7725b = eVar;
        this.f7726c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7724a) {
            case 0:
                i iVar = this.f7725b.f7729f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f7726c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7725b.f7729f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f7726c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

package d1;

import v0.i;
public final class c implements Runnable {
    public final int f8038a;
    public final e f8039b;
    public final Throwable f8040c;

    public c(e eVar, Throwable th2, int i10) {
        this.f8038a = i10;
        this.f8039b = eVar;
        this.f8040c = th2;
    }

    @Override
    public final void run() {
        switch (this.f8038a) {
            case 0:
                i iVar = this.f8039b.f8044f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f8040c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8039b.f8044f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f8040c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

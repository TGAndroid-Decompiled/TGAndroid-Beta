package d1;

import v0.i;
public final class c implements Runnable {
    public final int f7404a;
    public final e f7405b;
    public final Throwable f7406c;

    public c(e eVar, Throwable th2, int i10) {
        this.f7404a = i10;
        this.f7405b = eVar;
        this.f7406c = th2;
    }

    @Override
    public final void run() {
        switch (this.f7404a) {
            case 0:
                i iVar = this.f7405b.f7409f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f7406c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7405b.f7409f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f7406c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

package d1;

import v0.i;
public final class c implements Runnable {
    public final int f4244a;
    public final e f4245b;
    public final Throwable f4246c;

    public c(e eVar, Throwable th, int i9) {
        this.f4244a = i9;
        this.f4245b = eVar;
        this.f4246c = th;
    }

    @Override
    public final void run() {
        switch (this.f4244a) {
            case 0:
                i iVar = this.f4245b.f4250f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f4246c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4245b.f4250f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f4246c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

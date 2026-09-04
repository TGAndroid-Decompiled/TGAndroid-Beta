package d1;

import v0.i;
public final class c implements Runnable {
    public final int f6460a;
    public final e f6461b;
    public final Throwable f6462c;

    public c(e eVar, Throwable th2, int i10) {
        this.f6460a = i10;
        this.f6461b = eVar;
        this.f6462c = th2;
    }

    @Override
    public final void run() {
        switch (this.f6460a) {
            case 0:
                i iVar = this.f6461b.f6466f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f6462c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f6461b.f6466f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f6462c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

package d1;

import v0.i;
public final class c implements Runnable {
    public final int f6487a;
    public final e f6488b;
    public final Throwable f6489c;

    public c(e eVar, Throwable th2, int i10) {
        this.f6487a = i10;
        this.f6488b = eVar;
        this.f6489c = th2;
    }

    @Override
    public final void run() {
        switch (this.f6487a) {
            case 0:
                i iVar = this.f6488b.f6493f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f6489c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f6488b.f6493f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f6489c.getMessage(), 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

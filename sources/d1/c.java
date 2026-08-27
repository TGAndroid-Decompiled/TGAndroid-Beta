package d1;

import kotlin.jvm.internal.j;
import v0.i;

public final class c implements Runnable {

    public final int f4686a;

    public final e f4687b;

    public final Throwable f4688c;

    public c(e eVar, Throwable th, int i10) {
        this.f4686a = i10;
        this.f4687b = eVar;
        this.f4688c = th;
    }

    @Override
    public final void run() {
        switch (this.f4686a) {
            case 0:
                i iVar = this.f4687b.f4692f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f4688c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4687b.f4692f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f4688c.getMessage(), 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

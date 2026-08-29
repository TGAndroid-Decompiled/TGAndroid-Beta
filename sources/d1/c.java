package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class c implements Runnable {
    public final int f5253a;
    public final e f5254b;
    public final Throwable f5255c;

    public c(e eVar, Throwable th2, int i10) {
        this.f5253a = i10;
        this.f5254b = eVar;
        this.f5255c = th2;
    }

    @Override
    public final void run() {
        switch (this.f5253a) {
            case 0:
                i iVar = this.f5254b.f5259f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f5255c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f5254b.f5259f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f5255c.getMessage(), 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

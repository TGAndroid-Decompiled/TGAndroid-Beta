package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class c implements Runnable {
    public final int f4149a;
    public final e f4150b;
    public final Throwable f4151c;

    public c(e eVar, Throwable th2, int i10) {
        this.f4149a = i10;
        this.f4150b = eVar;
        this.f4151c = th2;
    }

    @Override
    public final void run() {
        switch (this.f4149a) {
            case 0:
                i iVar = this.f4150b.f4155f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f4151c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4150b.f4155f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f4151c.getMessage(), 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

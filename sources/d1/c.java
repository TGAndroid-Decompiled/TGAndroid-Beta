package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class c implements Runnable {
    public final int f4090a;
    public final e f4091b;
    public final Throwable f4092c;

    public c(e eVar, Throwable th2, int i10) {
        this.f4090a = i10;
        this.f4091b = eVar;
        this.f4092c = th2;
    }

    @Override
    public final void run() {
        switch (this.f4090a) {
            case 0:
                i iVar = this.f4091b.f4095f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(26), this.f4092c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4091b.f4095f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c(this.f4092c.getMessage(), 2));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

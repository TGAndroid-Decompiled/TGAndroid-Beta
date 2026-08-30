package e1;

import kotlin.jvm.internal.j;
import v0.i;
public final class c implements Runnable {
    public final int f5048a;
    public final d f5049b;
    public final w0.d f5050c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f5048a = i10;
        this.f5049b = dVar;
        this.f5050c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f5048a) {
            case 0:
                i iVar = this.f5049b.f5051f;
                if (iVar != null) {
                    iVar.onError(this.f5050c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f5049b.f5051f;
                if (iVar2 != null) {
                    Object obj = this.f5050c;
                    if (obj == null) {
                        obj = new w0.c("No provider data returned", 2);
                    }
                    iVar2.onError(obj);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}

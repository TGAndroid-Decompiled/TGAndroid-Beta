package e1;

import kotlin.jvm.internal.j;
import v0.i;

public final class c implements Runnable {

    public final int f5152a;

    public final d f5153b;

    public final w0.d f5154c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f5152a = i10;
        this.f5153b = dVar;
        this.f5154c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f5152a) {
            case 0:
                i iVar = this.f5153b.f5156f;
                if (iVar != null) {
                    iVar.onError(this.f5154c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f5153b.f5156f;
                if (iVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                Object cVar = this.f5154c;
                if (cVar == null) {
                    cVar = new w0.c("No provider data returned", 2);
                }
                iVar2.onError(cVar);
                return;
        }
    }
}

package e1;

import v0.i;
public final class c implements Runnable {
    public final int f7865a;
    public final d f7866b;
    public final w0.d f7867c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f7865a = i10;
        this.f7866b = dVar;
        this.f7867c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f7865a) {
            case 0:
                i iVar = this.f7866b.f7868f;
                if (iVar != null) {
                    iVar.onError(this.f7867c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7866b.f7868f;
                if (iVar2 != null) {
                    Object obj = this.f7867c;
                    if (obj == null) {
                        obj = new w0.c("No provider data returned", 2);
                    }
                    iVar2.onError(obj);
                    return;
                }
                kotlin.jvm.internal.i.h("callback");
                throw null;
        }
    }
}

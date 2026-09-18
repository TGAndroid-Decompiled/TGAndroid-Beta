package e1;

import v0.i;
public final class c implements Runnable {
    public final int f7866a;
    public final d f7867b;
    public final w0.d f7868c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f7866a = i10;
        this.f7867b = dVar;
        this.f7868c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f7866a) {
            case 0:
                i iVar = this.f7867b.f7869f;
                if (iVar != null) {
                    iVar.onError(this.f7868c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7867b.f7869f;
                if (iVar2 != null) {
                    Object obj = this.f7868c;
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

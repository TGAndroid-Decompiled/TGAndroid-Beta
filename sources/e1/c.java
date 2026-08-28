package e1;

import v0.i;
public final class c implements Runnable {
    public final int f4795a;
    public final d f4796b;
    public final w0.d f4797c;

    public c(d dVar, w0.d dVar2, int i9) {
        this.f4795a = i9;
        this.f4796b = dVar;
        this.f4797c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f4795a) {
            case 0:
                i iVar = this.f4796b.f4799f;
                if (iVar != null) {
                    iVar.onError(this.f4797c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4796b.f4799f;
                if (iVar2 != null) {
                    Object obj = this.f4797c;
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

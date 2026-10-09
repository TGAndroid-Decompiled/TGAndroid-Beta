package e1;

import v0.i;
public final class c implements Runnable {
    public final int f8507a;
    public final d f8508b;
    public final w0.d f8509c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f8507a = i10;
        this.f8508b = dVar;
        this.f8509c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f8507a) {
            case 0:
                i iVar = this.f8508b.f8511f;
                if (iVar != null) {
                    iVar.onError(this.f8509c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8508b.f8511f;
                if (iVar2 != null) {
                    Object obj = this.f8509c;
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

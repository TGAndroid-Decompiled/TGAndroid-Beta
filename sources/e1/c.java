package e1;

import v0.i;
public final class c implements Runnable {
    public final int f8300a;
    public final d f8301b;
    public final w0.d f8302c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f8300a = i10;
        this.f8301b = dVar;
        this.f8302c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f8300a) {
            case 0:
                i iVar = this.f8301b.f8303f;
                if (iVar != null) {
                    iVar.onError(this.f8302c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8301b.f8303f;
                if (iVar2 != null) {
                    Object obj = this.f8302c;
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

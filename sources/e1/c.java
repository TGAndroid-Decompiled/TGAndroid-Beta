package e1;

import v0.i;
public final class c implements Runnable {
    public final int f8713a;
    public final d f8714b;
    public final w0.d f8715c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f8713a = i10;
        this.f8714b = dVar;
        this.f8715c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f8713a) {
            case 0:
                i iVar = this.f8714b.f8717f;
                if (iVar != null) {
                    iVar.onError(this.f8715c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8714b.f8717f;
                if (iVar2 != null) {
                    Object obj = this.f8715c;
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

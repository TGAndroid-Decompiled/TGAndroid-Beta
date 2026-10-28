package e1;

import v0.i;
public final class d implements Runnable {
    public final int f9614a;
    public final e f9615b;
    public final w0.d f9616c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f9614a = i10;
        this.f9615b = eVar;
        this.f9616c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f9614a) {
            case 0:
                i iVar = this.f9615b.f9617f;
                if (iVar != null) {
                    iVar.onError(this.f9616c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f9615b.f9617f;
                if (iVar2 != null) {
                    Object obj = this.f9616c;
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

package e1;

import v0.i;
public final class d implements Runnable {
    public final int f8181a;
    public final e f8182b;
    public final w0.d f8183c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f8181a = i10;
        this.f8182b = eVar;
        this.f8183c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8181a) {
            case 0:
                i iVar = this.f8182b.f8184f;
                if (iVar != null) {
                    iVar.onError(this.f8183c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8182b.f8184f;
                if (iVar2 != null) {
                    Object obj = this.f8183c;
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

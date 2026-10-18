package e1;

import v0.i;
public final class d implements Runnable {
    public final int f8183a;
    public final e f8184b;
    public final w0.d f8185c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f8183a = i10;
        this.f8184b = eVar;
        this.f8185c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8183a) {
            case 0:
                i iVar = this.f8184b.f8186f;
                if (iVar != null) {
                    iVar.onError(this.f8185c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8184b.f8186f;
                if (iVar2 != null) {
                    Object obj = this.f8185c;
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

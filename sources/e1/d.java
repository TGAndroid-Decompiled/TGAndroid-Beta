package e1;

import v0.i;
public final class d implements Runnable {
    public final int f8182a;
    public final e f8183b;
    public final w0.d f8184c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f8182a = i10;
        this.f8183b = eVar;
        this.f8184c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8182a) {
            case 0:
                i iVar = this.f8183b.f8185f;
                if (iVar != null) {
                    iVar.onError(this.f8184c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8183b.f8185f;
                if (iVar2 != null) {
                    Object obj = this.f8184c;
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

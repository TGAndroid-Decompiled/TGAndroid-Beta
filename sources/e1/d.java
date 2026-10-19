package e1;

import v0.i;
public final class d implements Runnable {
    public final int f8180a;
    public final e f8181b;
    public final w0.d f8182c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f8180a = i10;
        this.f8181b = eVar;
        this.f8182c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8180a) {
            case 0:
                i iVar = this.f8181b.f8183f;
                if (iVar != null) {
                    iVar.onError(this.f8182c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8181b.f8183f;
                if (iVar2 != null) {
                    Object obj = this.f8182c;
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

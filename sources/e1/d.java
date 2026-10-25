package e1;

import v0.i;
public final class d implements Runnable {
    public final int f9615a;
    public final e f9616b;
    public final w0.d f9617c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f9615a = i10;
        this.f9616b = eVar;
        this.f9617c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f9615a) {
            case 0:
                i iVar = this.f9616b.f9618f;
                if (iVar != null) {
                    iVar.onError(this.f9617c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f9616b.f9618f;
                if (iVar2 != null) {
                    Object obj = this.f9617c;
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

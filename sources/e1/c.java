package e1;

import v0.i;
public final class c implements Runnable {
    public final int f8303a;
    public final d f8304b;
    public final w0.d f8305c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f8303a = i10;
        this.f8304b = dVar;
        this.f8305c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f8303a) {
            case 0:
                i iVar = this.f8304b.f8306f;
                if (iVar != null) {
                    iVar.onError(this.f8305c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8304b.f8306f;
                if (iVar2 != null) {
                    Object obj = this.f8305c;
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

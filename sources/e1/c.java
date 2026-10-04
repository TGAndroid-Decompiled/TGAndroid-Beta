package e1;

import v0.i;
public final class c implements Runnable {
    public final int f8514a;
    public final d f8515b;
    public final w0.d f8516c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f8514a = i10;
        this.f8515b = dVar;
        this.f8516c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f8514a) {
            case 0:
                i iVar = this.f8515b.f8518f;
                if (iVar != null) {
                    iVar.onError(this.f8516c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8515b.f8518f;
                if (iVar2 != null) {
                    Object obj = this.f8516c;
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

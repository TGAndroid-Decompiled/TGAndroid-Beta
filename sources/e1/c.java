package e1;

import v0.i;
public final class c implements Runnable {
    public final int f7850a;
    public final d f7851b;
    public final w0.d f7852c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f7850a = i10;
        this.f7851b = dVar;
        this.f7852c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f7850a) {
            case 0:
                i iVar = this.f7851b.f7853f;
                if (iVar != null) {
                    iVar.onError(this.f7852c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7851b.f7853f;
                if (iVar2 != null) {
                    Object obj = this.f7852c;
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

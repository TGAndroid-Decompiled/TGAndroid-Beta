package e1;

import v0.i;
public final class c implements Runnable {
    public final int f7849a;
    public final d f7850b;
    public final w0.d f7851c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f7849a = i10;
        this.f7850b = dVar;
        this.f7851c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f7849a) {
            case 0:
                i iVar = this.f7850b.f7852f;
                if (iVar != null) {
                    iVar.onError(this.f7851c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7850b.f7852f;
                if (iVar2 != null) {
                    Object obj = this.f7851c;
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

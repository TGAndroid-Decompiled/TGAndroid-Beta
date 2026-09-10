package e1;

import v0.i;
public final class c implements Runnable {
    public final int f7166a;
    public final d f7167b;
    public final w0.d f7168c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f7166a = i10;
        this.f7167b = dVar;
        this.f7168c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f7166a) {
            case 0:
                i iVar = this.f7167b.f7169f;
                if (iVar != null) {
                    iVar.onError(this.f7168c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7167b.f7169f;
                if (iVar2 != null) {
                    Object obj = this.f7168c;
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

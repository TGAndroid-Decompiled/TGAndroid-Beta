package e1;

import v0.i;
public final class d implements Runnable {
    public final int f8187a;
    public final e f8188b;
    public final w0.d f8189c;

    public d(e eVar, w0.d dVar, int i10) {
        this.f8187a = i10;
        this.f8188b = eVar;
        this.f8189c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8187a) {
            case 0:
                i iVar = this.f8188b.f8190f;
                if (iVar != null) {
                    iVar.onError(this.f8189c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8188b.f8190f;
                if (iVar2 != null) {
                    Object obj = this.f8189c;
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

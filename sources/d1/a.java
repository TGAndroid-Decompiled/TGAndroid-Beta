package d1;

import v0.i;
public final class a implements Runnable {
    public final int f7394a;
    public final e f7395b;
    public final w0.d f7396c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f7394a = i10;
        this.f7395b = eVar;
        this.f7396c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7394a) {
            case 0:
                i iVar = this.f7395b.f7405f;
                if (iVar != null) {
                    iVar.onError(this.f7396c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f7395b.f7405f;
                if (iVar2 != null) {
                    iVar2.onError(this.f7396c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f7395b.f7405f;
                if (iVar3 != null) {
                    iVar3.onError(this.f7396c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

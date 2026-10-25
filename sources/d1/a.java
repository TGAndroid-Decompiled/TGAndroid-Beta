package d1;

import v0.i;
public final class a implements Runnable {
    public final int f7821a;
    public final e f7822b;
    public final w0.d f7823c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f7821a = i10;
        this.f7822b = eVar;
        this.f7823c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7821a) {
            case 0:
                i iVar = this.f7822b.f7832f;
                if (iVar != null) {
                    iVar.onError(this.f7823c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f7822b.f7832f;
                if (iVar2 != null) {
                    iVar2.onError(this.f7823c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f7822b.f7832f;
                if (iVar3 != null) {
                    iVar3.onError(this.f7823c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

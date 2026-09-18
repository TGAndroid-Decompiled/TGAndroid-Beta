package d1;

import v0.i;
public final class a implements Runnable {
    public final int f7398a;
    public final e f7399b;
    public final w0.d f7400c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f7398a = i10;
        this.f7399b = eVar;
        this.f7400c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7398a) {
            case 0:
                i iVar = this.f7399b.f7409f;
                if (iVar != null) {
                    iVar.onError(this.f7400c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f7399b.f7409f;
                if (iVar2 != null) {
                    iVar2.onError(this.f7400c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f7399b.f7409f;
                if (iVar3 != null) {
                    iVar3.onError(this.f7400c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

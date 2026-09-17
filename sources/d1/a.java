package d1;

import v0.i;
public final class a implements Runnable {
    public final int f6454a;
    public final e f6455b;
    public final w0.d f6456c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f6454a = i10;
        this.f6455b = eVar;
        this.f6456c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f6454a) {
            case 0:
                i iVar = this.f6455b.f6466f;
                if (iVar != null) {
                    iVar.onError(this.f6456c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f6455b.f6466f;
                if (iVar2 != null) {
                    iVar2.onError(this.f6456c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f6455b.f6466f;
                if (iVar3 != null) {
                    iVar3.onError(this.f6456c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

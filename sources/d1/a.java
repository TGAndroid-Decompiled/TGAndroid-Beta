package d1;

import v0.i;
public final class a implements Runnable {
    public final int f8033a;
    public final e f8034b;
    public final w0.d f8035c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f8033a = i10;
        this.f8034b = eVar;
        this.f8035c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8033a) {
            case 0:
                i iVar = this.f8034b.f8045f;
                if (iVar != null) {
                    iVar.onError(this.f8035c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f8034b.f8045f;
                if (iVar2 != null) {
                    iVar2.onError(this.f8035c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f8034b.f8045f;
                if (iVar3 != null) {
                    iVar3.onError(this.f8035c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

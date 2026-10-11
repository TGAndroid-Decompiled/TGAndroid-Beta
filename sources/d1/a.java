package d1;

import v0.i;
public final class a implements Runnable {
    public final int f8032a;
    public final e f8033b;
    public final w0.d f8034c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f8032a = i10;
        this.f8033b = eVar;
        this.f8034c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8032a) {
            case 0:
                i iVar = this.f8033b.f8044f;
                if (iVar != null) {
                    iVar.onError(this.f8034c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f8033b.f8044f;
                if (iVar2 != null) {
                    iVar2.onError(this.f8034c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f8033b.f8044f;
                if (iVar3 != null) {
                    iVar3.onError(this.f8034c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

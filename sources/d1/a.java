package d1;

import v0.i;
public final class a implements Runnable {
    public final int f6261a;
    public final e f6262b;
    public final w0.d f6263c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f6261a = i10;
        this.f6262b = eVar;
        this.f6263c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f6261a) {
            case 0:
                i iVar = this.f6262b.f6272f;
                if (iVar != null) {
                    iVar.onError(this.f6263c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f6262b.f6272f;
                if (iVar2 != null) {
                    iVar2.onError(this.f6263c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f6262b.f6272f;
                if (iVar3 != null) {
                    iVar3.onError(this.f6263c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

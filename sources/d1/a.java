package d1;

import v0.i;
public final class a implements Runnable {
    public final int f7718a;
    public final e f7719b;
    public final w0.d f7720c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f7718a = i10;
        this.f7719b = eVar;
        this.f7720c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7718a) {
            case 0:
                i iVar = this.f7719b.f7729f;
                if (iVar != null) {
                    iVar.onError(this.f7720c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f7719b.f7729f;
                if (iVar2 != null) {
                    iVar2.onError(this.f7720c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f7719b.f7729f;
                if (iVar3 != null) {
                    iVar3.onError(this.f7720c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

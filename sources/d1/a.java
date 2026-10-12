package d1;

import v0.i;
public final class a implements Runnable {
    public final int f8030a;
    public final e f8031b;
    public final w0.d f8032c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f8030a = i10;
        this.f8031b = eVar;
        this.f8032c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8030a) {
            case 0:
                i iVar = this.f8031b.f8042f;
                if (iVar != null) {
                    iVar.onError(this.f8032c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f8031b.f8042f;
                if (iVar2 != null) {
                    iVar2.onError(this.f8032c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f8031b.f8042f;
                if (iVar3 != null) {
                    iVar3.onError(this.f8032c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

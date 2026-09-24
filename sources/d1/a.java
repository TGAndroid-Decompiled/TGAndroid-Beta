package d1;

import v0.i;
public final class a implements Runnable {
    public final int f7381a;
    public final e f7382b;
    public final w0.d f7383c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f7381a = i10;
        this.f7382b = eVar;
        this.f7383c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7381a) {
            case 0:
                i iVar = this.f7382b.f7392f;
                if (iVar != null) {
                    iVar.onError(this.f7383c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f7382b.f7392f;
                if (iVar2 != null) {
                    iVar2.onError(this.f7383c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f7382b.f7392f;
                if (iVar3 != null) {
                    iVar3.onError(this.f7383c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}

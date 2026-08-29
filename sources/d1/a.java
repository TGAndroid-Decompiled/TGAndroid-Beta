package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class a implements Runnable {
    public final int f5247a;
    public final e f5248b;
    public final w0.d f5249c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f5247a = i10;
        this.f5248b = eVar;
        this.f5249c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f5247a) {
            case 0:
                i iVar = this.f5248b.f5259f;
                if (iVar != null) {
                    iVar.onError(this.f5249c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f5248b.f5259f;
                if (iVar2 != null) {
                    iVar2.onError(this.f5249c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f5248b.f5259f;
                if (iVar3 != null) {
                    iVar3.onError(this.f5249c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

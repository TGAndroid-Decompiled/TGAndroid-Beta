package d1;

import kotlin.jvm.internal.j;
import v0.i;

public final class a implements Runnable {

    public final int f4680a;

    public final e f4681b;

    public final w0.d f4682c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f4680a = i10;
        this.f4681b = eVar;
        this.f4682c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f4680a) {
            case 0:
                i iVar = this.f4681b.f4692f;
                if (iVar != null) {
                    iVar.onError(this.f4682c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f4681b.f4692f;
                if (iVar2 != null) {
                    iVar2.onError(this.f4682c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f4681b.f4692f;
                if (iVar3 != null) {
                    iVar3.onError(this.f4682c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

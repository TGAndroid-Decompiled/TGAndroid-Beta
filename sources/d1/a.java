package d1;

import kotlin.jvm.internal.j;
public final class a implements Runnable {
    public final int f7594a;
    public final e f7595b;
    public final w0.d f7596c;

    public a(e eVar, w0.d dVar, int i7) {
        this.f7594a = i7;
        this.f7595b = eVar;
        this.f7596c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7594a) {
            case 0:
                v0.g gVar = this.f7595b.f7606f;
                if (gVar != null) {
                    gVar.a(this.f7596c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                v0.g gVar2 = this.f7595b.f7606f;
                if (gVar2 != null) {
                    gVar2.a(this.f7596c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar3 = this.f7595b.f7606f;
                if (gVar3 != null) {
                    gVar3.a(this.f7596c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

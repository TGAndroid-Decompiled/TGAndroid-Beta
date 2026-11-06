package d1;

import kotlin.jvm.internal.j;
public final class a implements Runnable {
    public final int f7929a;
    public final e f7930b;
    public final w0.d f7931c;

    public a(e eVar, w0.d dVar, int i7) {
        this.f7929a = i7;
        this.f7930b = eVar;
        this.f7931c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7929a) {
            case 0:
                v0.g gVar = this.f7930b.f7941f;
                if (gVar != null) {
                    gVar.a(this.f7931c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                v0.g gVar2 = this.f7930b.f7941f;
                if (gVar2 != null) {
                    gVar2.a(this.f7931c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar3 = this.f7930b.f7941f;
                if (gVar3 != null) {
                    gVar3.a(this.f7931c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

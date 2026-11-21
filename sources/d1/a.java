package d1;

import kotlin.jvm.internal.j;
public final class a implements Runnable {
    public final int f7628a;
    public final e f7629b;
    public final w0.d f7630c;

    public a(e eVar, w0.d dVar, int i7) {
        this.f7628a = i7;
        this.f7629b = eVar;
        this.f7630c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7628a) {
            case 0:
                v0.g gVar = this.f7629b.f7640f;
                if (gVar != null) {
                    gVar.a(this.f7630c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                v0.g gVar2 = this.f7629b.f7640f;
                if (gVar2 != null) {
                    gVar2.a(this.f7630c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar3 = this.f7629b.f7640f;
                if (gVar3 != null) {
                    gVar3.a(this.f7630c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

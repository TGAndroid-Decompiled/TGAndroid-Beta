package d1;

import kotlin.jvm.internal.j;
import v0.h;
public final class a implements Runnable {
    public final int f7984a;
    public final e f7985b;
    public final w0.d f7986c;

    public a(e eVar, w0.d dVar, int i3) {
        this.f7984a = i3;
        this.f7985b = eVar;
        this.f7986c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7984a) {
            case 0:
                h hVar = this.f7985b.f7996f;
                if (hVar != null) {
                    hVar.a(this.f7986c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                h hVar2 = this.f7985b.f7996f;
                if (hVar2 != null) {
                    hVar2.a(this.f7986c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar3 = this.f7985b.f7996f;
                if (hVar3 != null) {
                    hVar3.a(this.f7986c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}

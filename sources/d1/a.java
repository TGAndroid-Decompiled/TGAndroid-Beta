package d1;

import kotlin.jvm.internal.i;
import v0.h;
public final class a implements Runnable {
    public final int f5627a;
    public final f f5628b;
    public final w0.d f5629c;

    public a(f fVar, w0.d dVar, int i10) {
        this.f5627a = i10;
        this.f5628b = fVar;
        this.f5629c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f5627a) {
            case 0:
                h hVar = this.f5628b.f5641f;
                if (hVar != null) {
                    hVar.g(this.f5629c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            case 1:
                h hVar2 = this.f5628b.f5641f;
                if (hVar2 != null) {
                    hVar2.g(this.f5629c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar3 = this.f5628b.f5641f;
                if (hVar3 != null) {
                    hVar3.g(this.f5629c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
        }
    }
}

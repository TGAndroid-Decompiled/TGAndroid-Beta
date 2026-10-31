package e1;

import kotlin.jvm.internal.i;
import v0.h;
public final class c implements Runnable {
    public final int f6094a;
    public final d f6095b;
    public final w0.d f6096c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f6094a = i10;
        this.f6095b = dVar;
        this.f6096c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f6094a) {
            case 0:
                h hVar = this.f6095b.f6097f;
                if (hVar != null) {
                    hVar.g(this.f6096c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f6095b.f6097f;
                if (hVar2 != null) {
                    Object obj = this.f6096c;
                    if (obj == null) {
                        obj = new w0.c(2, "No provider data returned");
                    }
                    hVar2.g(obj);
                    return;
                }
                i.h("callback");
                throw null;
        }
    }
}

package d1;

import kotlin.jvm.internal.i;
import v0.h;
public final class c implements Runnable {
    public final int f5633a;
    public final f f5634b;
    public final Throwable f5635c;

    public c(f fVar, Throwable th2, int i10) {
        this.f5633a = i10;
        this.f5634b = fVar;
        this.f5635c = th2;
    }

    @Override
    public final void run() {
        switch (this.f5633a) {
            case 0:
                h hVar = this.f5634b.f5641f;
                if (hVar != null) {
                    hVar.g(new y0.a(new x0.a(26), this.f5635c.getMessage()));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f5634b.f5641f;
                if (hVar2 != null) {
                    hVar2.g(new w0.c(2, this.f5635c.getMessage()));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
        }
    }
}

package e1;

import kotlin.jvm.internal.j;
import v0.g;
public final class c implements Runnable {
    public final int f10135a;
    public final d f10136b;
    public final w0.d f10137c;

    public c(d dVar, w0.d dVar2, int i7) {
        this.f10135a = i7;
        this.f10136b = dVar;
        this.f10137c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f10135a) {
            case 0:
                g gVar = this.f10136b.f10139f;
                if (gVar != null) {
                    gVar.a(this.f10137c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.f10136b.f10139f;
                if (gVar2 != null) {
                    Object obj = this.f10137c;
                    if (obj == null) {
                        obj = new w0.c(2, "No provider data returned");
                    }
                    gVar2.a(obj);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}

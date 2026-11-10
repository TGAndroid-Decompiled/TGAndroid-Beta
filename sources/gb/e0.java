package gb;

import android.content.Context;
public final class e0 implements ib.b {
    public final int f13664a = 0;
    public final ib.c f13665b;
    public final d9.o f13666c;

    public e0(d9.o oVar, ib.c cVar) {
        this.f13666c = oVar;
        this.f13665b = cVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13664a) {
            case 0:
                return new d0((Context) this.f13666c.f8256a, (k1) this.f13665b.mo24get());
            default:
                return new jb.f((b) this.f13665b.mo24get(), (id.h) this.f13666c.f8256a);
        }
    }

    public e0(ib.c cVar, d9.o oVar) {
        this.f13665b = cVar;
        this.f13666c = oVar;
    }
}

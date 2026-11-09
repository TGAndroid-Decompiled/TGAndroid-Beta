package gb;

import android.content.Context;
public final class e0 implements ib.b {
    public final int f13662a = 0;
    public final ib.c f13663b;
    public final d9.o f13664c;

    public e0(d9.o oVar, ib.c cVar) {
        this.f13664c = oVar;
        this.f13663b = cVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13662a) {
            case 0:
                return new d0((Context) this.f13664c.f8251a, (k1) this.f13663b.mo24get());
            default:
                return new jb.f((b) this.f13663b.mo24get(), (id.h) this.f13664c.f8251a);
        }
    }

    public e0(ib.c cVar, d9.o oVar) {
        this.f13663b = cVar;
        this.f13664c = oVar;
    }
}

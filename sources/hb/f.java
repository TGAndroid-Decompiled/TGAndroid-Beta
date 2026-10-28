package hb;

import fb.u;
public final class f extends u {
    public volatile u f12731a;
    public final boolean f12732b;
    public final boolean f12733c;
    public final fb.g d;
    public final mb.a e;
    public final g f12734f;

    public f(g gVar, boolean z10, boolean z11, fb.g gVar2, mb.a aVar) {
        this.f12734f = gVar;
        this.f12732b = z10;
        this.f12733c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override
    public final Object read(nb.a aVar) {
        if (this.f12732b) {
            aVar.C();
            return null;
        }
        u uVar = this.f12731a;
        if (uVar == null) {
            uVar = this.d.c(this.f12734f, this.e);
            this.f12731a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        if (this.f12733c) {
            bVar.i();
            return;
        }
        u uVar = this.f12731a;
        if (uVar == null) {
            uVar = this.d.c(this.f12734f, this.e);
            this.f12731a = uVar;
        }
        uVar.write(bVar, obj);
    }
}

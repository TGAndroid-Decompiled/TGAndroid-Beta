package hb;

import fb.u;
public final class f extends u {
    public volatile u f12732a;
    public final boolean f12733b;
    public final boolean f12734c;
    public final fb.g d;
    public final mb.a e;
    public final g f12735f;

    public f(g gVar, boolean z10, boolean z11, fb.g gVar2, mb.a aVar) {
        this.f12735f = gVar;
        this.f12733b = z10;
        this.f12734c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override
    public final Object read(nb.a aVar) {
        if (this.f12733b) {
            aVar.C();
            return null;
        }
        u uVar = this.f12732a;
        if (uVar == null) {
            uVar = this.d.c(this.f12735f, this.e);
            this.f12732a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        if (this.f12734c) {
            bVar.i();
            return;
        }
        u uVar = this.f12732a;
        if (uVar == null) {
            uVar = this.d.c(this.f12735f, this.e);
            this.f12732a = uVar;
        }
        uVar.write(bVar, obj);
    }
}

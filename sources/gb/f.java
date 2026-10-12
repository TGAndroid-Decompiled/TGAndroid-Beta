package gb;

import eb.u;
public final class f extends u {
    public volatile u f10045a;
    public final boolean f10046b;
    public final boolean f10047c;
    public final eb.g d;
    public final lb.a e;
    public final g f10048f;

    public f(g gVar, boolean z10, boolean z11, eb.g gVar2, lb.a aVar) {
        this.f10048f = gVar;
        this.f10046b = z10;
        this.f10047c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (this.f10046b) {
            aVar.C();
            return null;
        }
        u uVar = this.f10045a;
        if (uVar == null) {
            uVar = this.d.c(this.f10048f, this.e);
            this.f10045a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        if (this.f10047c) {
            bVar.i();
            return;
        }
        u uVar = this.f10045a;
        if (uVar == null) {
            uVar = this.d.c(this.f10048f, this.e);
            this.f10045a = uVar;
        }
        uVar.write(bVar, obj);
    }
}

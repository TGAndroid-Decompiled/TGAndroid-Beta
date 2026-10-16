package hb;
public final class a0 extends y {
    public final eb.o f10400a;
    public final eb.g f10401b;
    public final lb.a f10402c;
    public final eb.v d;
    public final a6.i e = new a6.i(this, 23);
    public final boolean f10403f;
    public volatile eb.u f10404g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f10400a = oVar;
        this.f10401b = gVar;
        this.f10402c = aVar;
        this.d = vVar;
        this.f10403f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f10400a != null) {
            return this;
        }
        eb.u uVar = this.f10404g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f10401b.c(this.d, this.f10402c);
        this.f10404g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f10404g;
        if (uVar == null) {
            uVar = this.f10401b.c(this.d, this.f10402c);
            this.f10404g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f10400a;
        if (oVar == null) {
            eb.u uVar = this.f10404g;
            if (uVar == null) {
                uVar = this.f10401b.c(this.d, this.f10402c);
                this.f10404g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10403f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f10402c.f14654b, this.e), bVar);
        }
    }
}

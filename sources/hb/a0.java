package hb;
public final class a0 extends y {
    public final eb.o f10396a;
    public final eb.g f10397b;
    public final lb.a f10398c;
    public final eb.v d;
    public final a6.i e = new a6.i(this, 23);
    public final boolean f10399f;
    public volatile eb.u f10400g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f10396a = oVar;
        this.f10397b = gVar;
        this.f10398c = aVar;
        this.d = vVar;
        this.f10399f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f10396a != null) {
            return this;
        }
        eb.u uVar = this.f10400g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f10397b.c(this.d, this.f10398c);
        this.f10400g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f10400g;
        if (uVar == null) {
            uVar = this.f10397b.c(this.d, this.f10398c);
            this.f10400g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f10396a;
        if (oVar == null) {
            eb.u uVar = this.f10400g;
            if (uVar == null) {
                uVar = this.f10397b.c(this.d, this.f10398c);
                this.f10400g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10399f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f10398c.f14654b, this.e), bVar);
        }
    }
}
